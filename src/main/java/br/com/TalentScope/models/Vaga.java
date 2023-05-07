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

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Vaga {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String nome;

	@NotNull
	private String descricaoCargo;

	@NotNull
	@Digits(integer = 6, fraction = 2)
	private BigDecimal salario;

	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dtAbertura;

	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dtEncerramento;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dtProgEnvioFeedback;

	// private Usuario usuario;

	public Vaga() {
	}

	public Vaga(String nome, String descricaoCargo, BigDecimal salario, LocalDateTime dtAbertura,
			LocalDateTime dtEncerramento, LocalDateTime dtProgramacaoEnvio) {
		this.nome = nome;
		this.descricaoCargo = descricaoCargo;
		this.salario = salario;
		this.dtAbertura = dtAbertura;
		this.dtEncerramento = dtEncerramento;
		this.dtProgEnvioFeedback = dtProgramacaoEnvio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricaoCargo() {
		return descricaoCargo;
	}

	public void setDescricaoCargo(String descricaoCargo) {
		this.descricaoCargo = descricaoCargo;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDateTime getDtAbertura() {
		return dtAbertura;
	}

	public void setDtAbertura(LocalDateTime dtAbertura) {
		this.dtAbertura = dtAbertura;
	}

	public LocalDateTime getDtEncerramento() {
		return dtEncerramento;
	}

	public void setDtEncerramento(LocalDateTime dtEncerramento) {
		this.dtEncerramento = dtEncerramento;
	}

	public LocalDateTime getDtProgramacaoEnvio() {
		return dtProgEnvioFeedback;
	}

	public void setDtProgramacaoEnvio(LocalDateTime dtProgramacaoEnvio) {
		this.dtProgEnvioFeedback = dtProgramacaoEnvio;
	}

}
