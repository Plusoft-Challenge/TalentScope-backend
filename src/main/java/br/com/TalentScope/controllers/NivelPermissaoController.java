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
import br.com.TalentScope.models.NivelPermissao;
import br.com.TalentScope.repository.NivelPermissaoRepository;

@RestController
@RequestMapping("talentScope/nivelPermissao")
public class NivelPermissaoController {
	Logger log = LoggerFactory.getLogger(NivelPermissaoController.class);

	  @Autowired
	  NivelPermissaoRepository repository;

	  @GetMapping
	  public List<NivelPermissao> getAll(){
	    return repository.findAll();
	  }

	  @PostMapping
	  public ResponseEntity<NivelPermissao> create(@RequestBody @Valid NivelPermissao nivelPermissao){
	    log.info("Cadastrando nivel de permissao: " + nivelPermissao);

	    repository.save(nivelPermissao);
	    return ResponseEntity.status(HttpStatus.CREATED).body(nivelPermissao);
	  }
	  
	  @GetMapping("{id}")
	  public ResponseEntity<NivelPermissao> findById(@PathVariable Long id){
		  log.info("Buscando nivel de permissão com id " + id);
		  var nivelPermissao = getNivelPermissao(id);
		  return ResponseEntity.ok(nivelPermissao);
	  }
	  
	  @DeleteMapping("{id}")
	  public ResponseEntity<NivelPermissao> delete(@PathVariable Long id){
		  log.info("Apagando nivel de permossao com o id " + id);
		  var nivelPermissao = getNivelPermissao(id);
		  repository.delete(nivelPermissao);
		  return ResponseEntity.noContent().build();
	  }
	  
	  @PutMapping("{id}")
	  public ResponseEntity<NivelPermissao> update(@PathVariable Long id, @RequestBody @Valid NivelPermissao nivelPermissao){
		  log.info("Atualizando nivel de permissao com o id " + id);
		  getNivelPermissao(id);
		  nivelPermissao.setId(id);
		  repository.save(nivelPermissao);
		  return ResponseEntity.ok(nivelPermissao);
	  }
	  
	  private NivelPermissao getNivelPermissao(Long id) {
		  return repository.findById(id)
				  .orElseThrow(() -> new RestNotFoundException("nivel de permissão não encontrado"));
	  }
}
