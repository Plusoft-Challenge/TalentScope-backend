package br.com.TalentTracker.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "id")
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  @Max(value = 80)
  private String nome;

  @NotNull
  @Max(value = 80)
  private String email;

  @NotNull
  @Max(value = 16)
  private String senha;

  @NotNull
  private Boolean status;

  @NotNull
  private LocalDateTime dtCriacao;

  private LocalDateTime dtAlteracao;

  // private NivelPermissao nivelPermissao;
}
