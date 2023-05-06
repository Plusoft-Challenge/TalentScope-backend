package br.com.TalentScope.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Vaga {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  @Max(value = 80)
  private String nome;

  @NotNull
  private String descricaoCargo;

  @NotNull
  @Digits(integer = 6, fraction = 2)
  private BigDecimal salario;

  @NotNull
  private LocalDateTime dtAbertura;

  @NotNull
  private LocalDateTime dtEncerramento;

  private LocalDateTime dtProgramacaoEnvio;

  // private Usuario usuario;
}
