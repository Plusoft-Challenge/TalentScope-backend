package br.com.TalentScope.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.TalentScope.models.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}
