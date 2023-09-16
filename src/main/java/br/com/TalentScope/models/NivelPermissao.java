package br.com.TalentScope.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "ts_nivel_permissao")
@EqualsAndHashCode(of = "id")
public class NivelPermissao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String nome;

	@NotNull
	private String descricao;

	public NivelPermissao(@NotNull String nome, @NotNull String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

}
