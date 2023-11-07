package br.com.TalentScope.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.TalentScope.models.Habilidade;

@Repository
public interface HabilidadeRepository extends JpaRepository<Habilidade, Long>{

}
