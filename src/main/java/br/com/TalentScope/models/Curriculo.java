package br.com.TalentScope.models;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(of = "id")
public class Curriculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	private String arquivo;

	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dtEnvioCurriculo;

	@NotNull
	private String nomeCandidato;

	@NotNull
	private String email;

	@ManyToOne
	private Vaga vaga;

	@OneToOne(cascade = {CascadeType.MERGE})
	private Feedback feedback;

	public Curriculo(String arquivo, LocalDateTime dtEnvioCurriculo, String nomeCandidato, String email, Feedback feedback) {
		this.arquivo = arquivo;
		this.dtEnvioCurriculo = dtEnvioCurriculo;
		this.nomeCandidato = nomeCandidato;
		this.email = email;
		this.feedback = feedback;
	}

	

}
