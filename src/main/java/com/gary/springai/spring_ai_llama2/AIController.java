package com.gary.springai.spring_ai_llama2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AIController {
    private final LlamaAiService llamaAiService;

    @GetMapping("/generate")
    public String generate(@RequestParam(value="promptMessage") String promptMessage) {
        return llamaAiService.generateResult(promptMessage);
    }
}
