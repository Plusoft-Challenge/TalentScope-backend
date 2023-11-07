package br.com.TalentScope.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.TalentScope.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
  
}
