package br.com.TalentScope.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
@Table(name = "ts_feedback")
@EqualsAndHashCode(of = "id")
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

	public Feedback(String feedback, Boolean aprovado, LocalDateTime dtAnalise,
			Boolean envioFeedback, LocalDateTime dtEnvioFeedback) {
		this.feedback = feedback;
		this.aprovado = aprovado;
		this.dtAnalise = dtAnalise;
		this.envioFeedback = envioFeedback;
		this.dtEnvioFeedback = dtEnvioFeedback;
	}
	
}
