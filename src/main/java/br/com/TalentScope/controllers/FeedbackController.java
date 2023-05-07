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
import br.com.TalentScope.models.Feedback;
import br.com.TalentScope.repository.FeedbackRepository;

@RestController
@RequestMapping("talentScope/feedback")
public class FeedbackController {
	Logger log = LoggerFactory.getLogger(FeedbackController.class);
	
	@Autowired
	FeedbackRepository repository;
	
	@GetMapping
	  public List<Feedback> getAll(){
	    return repository.findAll();
	  }

	  @PostMapping
	  public ResponseEntity<Feedback> create(@RequestBody @Valid Feedback feedback){
	    log.info("Cadastrando usuario: " + feedback);

	    repository.save(feedback);
	    return ResponseEntity.status(HttpStatus.CREATED).body(feedback);
	  }
	  
	  @GetMapping("{id}")
	  public ResponseEntity<Feedback> findById(@PathVariable Long id){
		  log.info("Buscando usuario com id " + id);
		  var feedback = getFeedback(id);
		  return ResponseEntity.ok(feedback);
	  }
	  
	  @DeleteMapping("{id}")
	  public ResponseEntity<Feedback> delete(@PathVariable Long id){
		  log.info("Apagando usuario com o id " + id);
		  var feedback = getFeedback(id);
		  repository.delete(feedback);
		  return ResponseEntity.noContent().build();
	  }
	  
	  @PutMapping("{id}")
	  public ResponseEntity<Feedback> update(@PathVariable Long id, @RequestBody @Valid Feedback feedback){
		  log.info("Atualizando usuario com o id " + id);
		  getFeedback(id);
		  feedback.setId(id);
		  repository.save(feedback);
		  return ResponseEntity.ok(feedback);
	  }
	  
	  private Feedback getFeedback(Long id) {
		  return repository.findById(id)
				  .orElseThrow(() -> new RestNotFoundException("feedback não encontrado"));
	  }
}
