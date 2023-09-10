package br.com.TalentScope.controllers;

import java.util.List;

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
import br.com.TalentScope.models.ChatGpt;
import br.com.TalentScope.models.Curriculo;
import br.com.TalentScope.models.Habilidade;
import br.com.TalentScope.models.Vaga;
import br.com.TalentScope.repository.VagaRepository;

@RestController
@RequestMapping("talentScope/vagas")
public class VagaController {
	Logger log = LoggerFactory.getLogger(UsuarioController.class);

	private List<Habilidade> habilidades;

	ChatGptController chatGptController;
	ChatGpt chatGpt;
	Curriculo curriculo;
	Vaga vaga;

	@Autowired
	VagaRepository repository;

	@GetMapping
	public List<Vaga> getAll() {
		return repository.findAll();
	}

	@PostMapping
	public ResponseEntity<Vaga> create(@RequestBody @Valid Vaga vaga, Habilidade habilidade) {
		log.info("Cadastrando vaga: " + vaga);

		repository.save(vaga);

		// Assim que a vaga é criada, o processo do chatgpt inicializa - Está correto esse fluxo???????
		//chatGptController.generate(chatGpt, curriculo, vaga);

		return ResponseEntity.status(HttpStatus.CREATED).body(vaga);
	}

	@GetMapping("{id}")
	public ResponseEntity<Vaga> findById(@PathVariable Long id) {
		log.info("Buscando vaga com id " + id);
		var vaga = getVaga(id);
		return ResponseEntity.ok(vaga);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Vaga> delete(@PathVariable Long id) {
		log.info("Apagando vaga com o id " + id);
		var vaga = getVaga(id);
		repository.delete(vaga);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("{id}")
	public ResponseEntity<Vaga> update(@PathVariable Long id, @RequestBody @Valid Vaga vaga) {
		log.info("Atualizando vaga com o id " + id);
		getVaga(id);
		vaga.setId(id);
		repository.save(vaga);
		return ResponseEntity.ok(vaga);
	}

	private Vaga getVaga(Long id) {
		return repository.findById(id).orElseThrow(() -> new RestNotFoundException("vaga não encontrada"));
	}
}
