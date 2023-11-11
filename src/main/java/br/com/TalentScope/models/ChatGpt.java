package br.com.TalentScope.models;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ChatGpt {
	private String texto;
	// private Double temperature = 0.0;
}
