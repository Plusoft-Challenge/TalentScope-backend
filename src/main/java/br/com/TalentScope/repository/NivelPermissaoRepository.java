package br.com.TalentScope.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.TalentScope.models.NivelPermissao;

@Repository
public interface NivelPermissaoRepository extends JpaRepository<NivelPermissao, Long>{

}
