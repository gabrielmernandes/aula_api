package application.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MensagemController {
    private String[] frutas = {"Maçã", "Banana", "Morango"};

    @GetMapping("/frutas")
    public String[] list() {
        return this.frutas;
    }
}