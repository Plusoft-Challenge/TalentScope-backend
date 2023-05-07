package br.com.TalentScope.models;

import java.sql.Blob;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
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

	// private Feedback feedback;
	// private Vaga vaga;

	public Curriculo() {
	}

	public Curriculo(String arquivo, LocalDateTime dtEnvioCurriculo, String nomeCandidato,
			String email) {
		super();
		this.arquivo = arquivo;
		this.dtEnvioCurriculo = dtEnvioCurriculo;
		this.nomeCandidato = nomeCandidato;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public LocalDateTime getDtEnvioCurriculo() {
		return dtEnvioCurriculo;
	}

	public void setDtEnvioCurriculo(LocalDateTime dtEnvioCurriculo) {
		this.dtEnvioCurriculo = dtEnvioCurriculo;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
