package br.com.TalentScope.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.TalentScope.models.Curriculo;

@Repository
public interface CurriculoRepository extends JpaRepository<Curriculo, Long>{

}
