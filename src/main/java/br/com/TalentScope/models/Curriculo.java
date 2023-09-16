package br.com.TalentScope.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
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
@Table(name = "ts_curriculo")
@EqualsAndHashCode(of = "id")
public class Curriculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Transient
	private String texto;
	
	@Lob
	private byte[] arquivo;
	
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dtEnvioCurriculo;

	@NotNull
	private String nomeCandidato;

	@NotNull
	private String email;

	private int ranking;

	@ManyToOne
	private Vaga vaga;

//	@OneToOne(cascade = { CascadeType.MERGE })
//	private Feedback feedback;

	public Curriculo(String texto, LocalDateTime dtEnvioCurriculo, String nomeCandidato, String email,
			Feedback feedback) {
		this.texto = texto;
		this.dtEnvioCurriculo = dtEnvioCurriculo;
		this.nomeCandidato = nomeCandidato;
		this.email = email;
	}

}
