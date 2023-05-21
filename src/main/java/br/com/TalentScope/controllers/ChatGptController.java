package br.com.TalentScope.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

import br.com.TalentScope.models.ChatGpt;

@RestController
@RequestMapping("/talentScope/chatgpt/text")
public class ChatGptController {

  @Value("${openai.api.key}")
  private String TOKEN_OPEN_AI;

  @PostMapping
  public ResponseEntity<?> generate(@RequestBody ChatGpt textChatGpt){
      try {
          OpenAiService service = new OpenAiService(TOKEN_OPEN_AI);

          CompletionRequest completionRequest = CompletionRequest.builder()
                  .model("davinci")
                  .prompt(textChatGpt.getTexto())
                  .temperature(textChatGpt.getTemperature())
                  .maxTokens(2000)
                  .build();

          return ResponseEntity.ok(service.createCompletion(completionRequest).getChoices());
      } catch (Exception e) {
          return ResponseEntity.badRequest()
                  .body(e.getMessage());
      }
  }
}
