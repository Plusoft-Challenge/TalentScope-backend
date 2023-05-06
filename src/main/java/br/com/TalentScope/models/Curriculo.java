package br.com.TalentScope.models;

import java.sql.Blob;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Curriculo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotEmpty
  private Blob arquivo;

  @NotNull
  private LocalDateTime dtEnvioCurriculo;

  @NotNull
  @Max(value = 80)
  private String nomeCandidato;

  @NotNull
  @Max(value = 80)
  private String email;

  // private Feedback feedback;
  // private Vaga vaga;
}
