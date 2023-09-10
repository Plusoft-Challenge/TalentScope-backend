package br.com.TalentScope.services;

import org.springframework.stereotype.Service;

import br.com.TalentScope.models.Curriculo;
import br.com.TalentScope.models.Vaga;

@Service
public class ChatGptService {

	public String generateTextGpt(Curriculo curriculo, Vaga vaga) {
		String textoChatGpt;

		textoChatGpt = "Analise o currilo a seguir: " + curriculo.getTexto() + ". A vaga tem essa descrição: "
				+ vaga.getDescricaoVaga() + " e requer essas habilidades:" + vaga.getHabilidades()
				+ ". Com base na vaga e habilidades, com a analise do curriculo, em um ranking de 1 a 5, "
				+ "qual é a posição desse candidato para essa vaga?"
				+ "Retorne também o nome do candidato e o e-mail. Retorne somente o ranking, o nome e o e-mail"
				+ "exatamente como esse exemplo e separado por pipe. Exemplo: ranking:5|nome:Jose|email:jose@email";
		return textoChatGpt;
	}

}
