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
import br.com.TalentScope.models.Habilidade;
import br.com.TalentScope.repository.HabilidadeRepository;

@RestController
@RequestMapping("talentScope/habilidades")
public class HabilidadeController {
	Logger log = LoggerFactory.getLogger(HabilidadeController.class);

	@Autowired
	HabilidadeRepository repository;

	@GetMapping
	public List<Habilidade> getAll() {
		return repository.findAll();
	}

	@PostMapping
	public ResponseEntity<Habilidade> create(@RequestBody @Valid Habilidade habilidade) {
		log.info("Cadastrando habilidade: " + habilidade);

		repository.save(habilidade);
		return ResponseEntity.status(HttpStatus.CREATED).body(habilidade);
	}

	@GetMapping("{id}")
	public ResponseEntity<Habilidade> findById(@PathVariable Long id) {
		log.info("Buscando habilidade com id " + id);
		var habilidade = getHabilidade(id);
		return ResponseEntity.ok(habilidade);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Habilidade> delete(@PathVariable Long id) {
		log.info("Apagando habilidade com o id " + id);
		var habilidade = getHabilidade(id);
		repository.delete(habilidade);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("{id}")
	public ResponseEntity<Habilidade> update(@PathVariable Long id, @RequestBody @Valid Habilidade habilidade) {
		log.info("Atualizando habilidade com o id " + id);
		getHabilidade(id);
		habilidade.setId(id);
		repository.save(habilidade);
		return ResponseEntity.ok(habilidade);
	}

	private Habilidade getHabilidade(Long id) {
		return repository.findById(id).orElseThrow(() -> new RestNotFoundException("habilidade não encontrado"));
	}
}
