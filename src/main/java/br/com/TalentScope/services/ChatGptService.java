package br.com.TalentScope.services;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.com.TalentScope.controllers.VagaController;
import br.com.TalentScope.models.ChatGpt;
import br.com.TalentScope.models.Curriculo;
import br.com.TalentScope.models.Vaga;

@Service
public class ChatGptService {

	@Autowired
	private VagaController vagaController;

	@Value("${outputpath}")
	private String outputFolderPath;

	@Value("${sourcepath}")
	private String sourceFolderPath;

	@Autowired
	private ChatGpt chatGpt;
	

	CurriculoService curriculoService;
	//File sourceFolder = new File(sourceFolderPath);
	//File file = new File("/home/isamary/Documentos/FIAP/challenge-2semestre/TalentScope-backend/arquivos/beatrizTorres.pdf");


	public String generateTextGpt(Vaga vaga) throws IOException {
		//ChatGpt chatGpt = new ChatGpt();
		// chatGpt.setTexto(curriculoService.textCurriculo());
		String textoChatGpt = "Analise o currilo a seguir: " + chatGpt.getTexto() + ". A vaga tem essa descrição: "
				+ vagaController.findDescriptionById(47l) + " e requer essas habilidades:" + vagaController.findHabilitiesById(47l)
				+ ". Com base na vaga e habilidades, com a analise do curriculo, em um ranking de 1 a 5, "
				+ "qual é a posição desse candidato para essa vaga?"
				+ "Retorne também o nome do candidato e o e-mail. Retorne somente o ranking, o nome e o e-mail"
				+ "exatamente como esse exemplo e separado por pipe. Exemplo: ranking:5|nome:Jose|email:jose@email";

		return textoChatGpt;
	}

}
