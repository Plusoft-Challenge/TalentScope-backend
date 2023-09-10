package br.com.TalentScope.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

import br.com.TalentScope.models.ChatGpt;
import br.com.TalentScope.models.Curriculo;
import br.com.TalentScope.models.Vaga;
import br.com.TalentScope.services.ChatGptService;

@RestController
@RequestMapping("/talentScope/chatgpt/text")
public class ChatGptController {

	Logger log = LoggerFactory.getLogger(UsuarioController.class);

	Curriculo curriculo;

	private String openaiResponse;

	@Autowired
	private ChatGptService chatGptService;

	@Value("${openai.api.key}")
	private String TOKEN_OPEN_AI;

	@PostMapping
	public ResponseEntity<?> generate(@RequestBody ChatGpt textChatGpt, Curriculo curriculo, Vaga vaga) {
		try {
			OpenAiService service = new OpenAiService(TOKEN_OPEN_AI);

			CompletionRequest completionRequest = CompletionRequest.builder().model("text-davinci-003")
					.prompt(chatGptService.generateTextGpt(curriculo, vaga))
					// .temperature(textChatGpt.getTemperature())
					.maxTokens(3000).build();

			// Obtem a resposta do serviço OpenAI
			openaiResponse = service.createCompletion(completionRequest).getChoices().get(0).getText();

			return ResponseEntity.ok(service.createCompletion(completionRequest).getChoices());
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	// retorna o resultado do chatGpt
	public String getOpeniaReponse() {
		return openaiResponse;
	}

	// Método para extrair as informações de ranking, nome e e-mail do texto de
	// resposta do ChatGPT
	public String[] extractInformation(String openaiResponse) {

		if (openaiResponse != null) {
			String[] parts = openaiResponse.split("\\|");

			String rankingPart = parts[0];
			String nomePart = parts[1];
			String emailPart = parts[2];

			String[] rankingKeyValue = rankingPart.split(":");
			String[] nomeKeyValue = nomePart.split(":");
			String[] emailKeyValue = emailPart.split(":");

			String ranking = rankingKeyValue[1];
			String nome = nomeKeyValue[1];
			String email = emailKeyValue[1];
			return new String[] { ranking, nome, email };
		} else {
			throw new IllegalArgumentException("Não foi possível extrair as informações necessárias.");
		}
	}

}