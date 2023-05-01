package br.com.TalentTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.TalentTracker.models.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Long>{
  
}
