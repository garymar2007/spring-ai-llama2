package com.gary.springai.spring_ai_llama2;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LlamaAiService {
    private final OllamaChatModel chatModel;
    public String generateResult(String promptMessage) {
        ChatResponse response = chatModel.call(
                new Prompt(
                        promptMessage,
                        OllamaOptions.create()
                                .withModel("llama2")
                )
        );
        return response.getResult().getOutput().getContent();
    }
}
