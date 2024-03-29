package br.com.TalentScope.controllers;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.TalentScope.exception.RestNotFoundException;
import br.com.TalentScope.models.Curriculo;
import br.com.TalentScope.repository.CurriculoRepository;
import br.com.TalentScope.services.CurriculoService;

@RestController
@RequestMapping("talentScope")
public class CurriculoController {

	Logger log = LoggerFactory.getLogger(CurriculoController.class);

	@Autowired
	CurriculoRepository repository;

//	@Autowired
//	private FeedbackRepository feedbackRepository;

	@Autowired
	private CurriculoService curriculoService;

	ChatGptController chatGptController;

	@Value("${sourcepath}")
	private String sourceFolderPath;

	@Value("${outputpath}")
	private String outputFolderPath;

	@GetMapping("/curriculos")
	public List<Curriculo> getAll() {
		return repository.findAll();
	}

	@PostMapping("/curriculo")
	public ResponseEntity<Curriculo> create(@PathVariable(value = "feedbackId") Long feedbackId,
			@RequestBody @Valid Curriculo curriculo) {
		log.info("Cadastrando curriculo: " + curriculo);

		// Seta os valores conforme o retorno do chatGpt
		setCurriculoValues(curriculo);

//		Feedback feedback = feedbackRepository.findById(feedbackId)
//		.orElseThrow(() -> new RestNotFoundException("Feedback não encontrado"));
//		curriculo.setFeedback(feedback);
		repository.save(curriculo);
		return ResponseEntity.status(HttpStatus.CREATED).body(curriculo);
	}

	@GetMapping("/curriculos/{id}")
	public ResponseEntity<Curriculo> findById(@PathVariable Long id) {
		log.info("Buscando curriculo com o id " + id);
		var curriculo = getCurriculo(id);
		return ResponseEntity.ok(curriculo);
	}

	@DeleteMapping("/curriculos/{id}")
	public ResponseEntity<Curriculo> delete(@PathVariable Long id) {
		log.info("Apagando curriculo com o id " + id);
		var curriculo = getCurriculo(id);
		repository.delete(curriculo);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/curriculo/{id}")
	public ResponseEntity<Curriculo> update(@PathVariable Long id, @RequestBody @Valid Curriculo curriculo) {
		log.info("Atualizando curriculo com o id " + id);
		getCurriculo(id);
		curriculo.setId(id);
		repository.save(curriculo);
		return ResponseEntity.ok(curriculo);
	}

	private Curriculo getCurriculo(Long id) {
		return repository.findById(id).orElseThrow(() -> new RestNotFoundException("curriculo não encontrado"));
	}

	@GetMapping("/extract")
	public String extractCurriculo() {
		try {
			log.info("Extraindo curriculo em pdf...");
			curriculoService.extractTextFromCurriculosInFolder(sourceFolderPath, outputFolderPath);
			return "Extração do currículo em PDF concluída com sucesso!";
		} catch (IOException e) {
			e.printStackTrace();
			return "Erro durante a extração de currículo: " + e.getMessage();
		}
	}

	public void setCurriculoValues(Curriculo curriculo) {
		// Extrai as informações de ranking, nome e e-mail
		String[] parts = chatGptController.extractInformation(chatGptController.getOpeniaReponse());

		// setar os valores no curriculo
		curriculo.setRanking(Integer.valueOf(parts[0]));
		curriculo.setNomeCandidato(parts[1]);
		curriculo.setEmail(parts[2]);
	}
}
