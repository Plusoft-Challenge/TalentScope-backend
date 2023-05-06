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
import br.com.TalentScope.models.Usuario;
import br.com.TalentScope.repository.UsuariosRepository;

@RestController
@RequestMapping("talentScope/usuarios")
public class UsuarioController {

  Logger log = LoggerFactory.getLogger(UsuarioController.class);

  @Autowired
  UsuariosRepository repository;

  @GetMapping
  public List<Usuario> getAll(){
    return repository.findAll();
  }

  @PostMapping
  public ResponseEntity<Usuario> create(@RequestBody @Valid Usuario usuario){
    log.info("Cadastrando usuario: " + usuario);

    repository.save(usuario);
    return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
  }
  
  @GetMapping("{id}")
  public ResponseEntity<Usuario> findById(@PathVariable Long id){
	  log.info("Buscando usuario com id " + id);
	  var usuario = getUsuario(id);
	  return ResponseEntity.ok(usuario);
  }
  
  @DeleteMapping("{id}")
  public ResponseEntity<Usuario> delete(@PathVariable Long id){
	  log.info("Apagando usuario com o id " + id);
	  var usuario = getUsuario(id);
	  repository.delete(usuario);
	  return ResponseEntity.noContent().build();
  }
  
  @PutMapping("{id}")
  public ResponseEntity<Usuario> update(@PathVariable Long id, @RequestBody @Valid Usuario usuario){
	  log.info("Atualizando usuario com o id " + id);
	  getUsuario(id);
	  usuario.setId(id);
	  repository.save(usuario);
	  return ResponseEntity.ok(usuario);
  }
  
  private Usuario getUsuario(Long id) {
	  return repository.findById(id)
			  .orElseThrow(() -> new RestNotFoundException("usuário não encontrado"));
  }
}
