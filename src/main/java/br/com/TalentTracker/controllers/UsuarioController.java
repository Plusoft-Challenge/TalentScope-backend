package br.com.TalentTracker.controllers;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.TalentTracker.models.Usuario;
import br.com.TalentTracker.repository.UsuariosRepository;

@RestController
@RequestMapping("/talentScope/usuarios")
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
}
