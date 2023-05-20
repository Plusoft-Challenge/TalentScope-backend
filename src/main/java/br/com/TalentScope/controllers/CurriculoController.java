package br.com.TalentScope.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
import br.com.TalentScope.models.Feedback;
import br.com.TalentScope.repository.CurriculoRepository;
import br.com.TalentScope.repository.FeedbackRepository;

@RestController
@RequestMapping("talentScope")
public class CurriculoController {

	Logger log = LoggerFactory.getLogger(CurriculoController.class);

	@Autowired
	CurriculoRepository repository;

	@Autowired
	private FeedbackRepository feedbackRepository;

	@GetMapping("/curriculos")
	public List<Curriculo> getAll(){
		return repository.findAll();
	}

	@PostMapping("/feedback/{feedbackId}/curriculo")
	public ResponseEntity<Curriculo> create(@PathVariable(value="feedbackId") Long feedbackId, @RequestBody @Valid Curriculo curriculo){
		log.info("Cadastrando usuario: " + curriculo);

		Feedback feedback = feedbackRepository.findById(feedbackId)
		.orElseThrow(() -> new RestNotFoundException("Feedback não encontrado"));
		curriculo.setFeedback(feedback);
	  repository.save(curriculo);
	  return ResponseEntity.status(HttpStatus.CREATED).body(curriculo);
	}

	@GetMapping("/curriculos/{id}")
	public ResponseEntity<Curriculo> findById(@PathVariable Long id){
		log.info("Buscando curriculo com o id " + id);
		var curriculo = getCurriculo(id);
		return ResponseEntity.ok(curriculo);
	}

	@DeleteMapping("/curriculos/{id}")
	public ResponseEntity<Curriculo> delete(@PathVariable Long id){
		log.info("Apagando curriculo com o id " + id);
		var curriculo = getCurriculo(id);
		repository.delete(curriculo);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/curriculos/{id}")
	public ResponseEntity<Curriculo> update(@PathVariable Long id, @RequestBody @Valid Curriculo curriculo){
		log.info("Atualizando curriculo com o id " + id);
		getCurriculo(id);
		curriculo.setId(id);
		repository.save(curriculo);
		return ResponseEntity.ok(curriculo);
	}

	private Curriculo getCurriculo(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RestNotFoundException("curriculo não encontrado"));
	}
}
