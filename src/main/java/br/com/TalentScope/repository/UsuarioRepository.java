package br.com.TalentScope.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.TalentScope.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
  
}
