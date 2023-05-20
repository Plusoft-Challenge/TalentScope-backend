package br.com.TalentScope.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

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
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Length(min = 3, max = 80, message = "O nome deverá ter no min. {min} e max. {max} caracteres")
	private String nome;

	@NotNull
	@Email(message = "Email não está valido", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
	private String email;

	@NotNull
	@Size(min = 6, max = 16)
	private String senha;

	@NotNull
	private Boolean status;

	@NotNull
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dtCriacao;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dtAlteracao;
	
	@ManyToOne
	private NivelPermissao nivelPermissao;

	public Usuario(
			String nome, String email, String senha, Boolean status, LocalDateTime dtCriacao, LocalDateTime dtAlteracao) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.status = status;
		this.dtCriacao = dtCriacao;
		this.dtAlteracao = dtAlteracao;
	}

	
}
