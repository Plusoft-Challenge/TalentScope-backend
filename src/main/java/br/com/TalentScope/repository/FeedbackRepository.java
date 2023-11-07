package br.com.TalentScope.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.TalentScope.models.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}
