package br.com.TalentScope.models;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

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
public class Vaga {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String nome;

	@NotBlank
	private String descricaoCargo;

	@NotBlank
	private String descricaoVaga;
//	@NotNull
//	@Digits(integer = 6, fraction = 2)
//	private BigDecimal salario;

	@NotBlank
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dtAbertura;

	@NotBlank
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dtEncerramento;

//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//	private LocalDateTime dtProgEnvioFeedback;

	@ManyToOne
	private Usuario usuario;

	@ManyToMany
	private List<Habilidade> habilidades;

	public Vaga(String nome, String descricaoCargo, LocalDateTime dtAbertura, LocalDateTime dtEncerramento,
			LocalDateTime dtProgEnvioFeedback) {
		this.nome = nome;
		this.descricaoCargo = descricaoCargo;
		this.dtAbertura = dtAbertura;
		this.dtEncerramento = dtEncerramento;
	}

}
