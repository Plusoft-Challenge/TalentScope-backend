package br.com.TalentScope.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String feedback;

	private Boolean aprovado;

	@NotNull
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dtAnalise;

	@NotNull
	private Boolean envioFeedback;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dtEnvioFeedback;

	public Feedback() {
	}

	public Feedback(String feedback, Boolean aprovado, LocalDateTime dtAnalise, Boolean envioFeedback,
			LocalDateTime dtEnvioFeedback) {
		super();
		this.feedback = feedback;
		this.aprovado = aprovado;
		this.dtAnalise = dtAnalise;
		this.envioFeedback = envioFeedback;
		this.dtEnvioFeedback = dtEnvioFeedback;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Boolean getAprovado() {
		return aprovado;
	}

	public void setAprovado(Boolean aprovado) {
		this.aprovado = aprovado;
	}

	public LocalDateTime getDtAnalise() {
		return dtAnalise;
	}

	public void setDtAnalise(LocalDateTime dtAnalise) {
		this.dtAnalise = dtAnalise;
	}

	public Boolean getEnvioFeedback() {
		return envioFeedback;
	}

	public void setEnvioFeedback(Boolean envioFeedback) {
		this.envioFeedback = envioFeedback;
	}

	public LocalDateTime getDtEnvioFeedback() {
		return dtEnvioFeedback;
	}

	public void setDtEnvioFeedback(LocalDateTime dtEnvioFeedback) {
		this.dtEnvioFeedback = dtEnvioFeedback;
	}

}
