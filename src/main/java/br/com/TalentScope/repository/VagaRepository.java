package br.com.TalentScope.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.TalentScope.models.Vaga;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long>{

}
