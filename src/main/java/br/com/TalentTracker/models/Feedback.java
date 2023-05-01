package br.com.TalentTracker.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Feedback {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  private String feedback;

  private Boolean aprovado;

  @NotNull
  private LocalDateTime dtAnalise;

  @NotNull
  private Boolean envioFeedback;

  private LocalDateTime dtEnvioFeedback;
}
