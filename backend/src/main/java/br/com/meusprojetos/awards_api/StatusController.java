package br.com.meusprojetos.awards_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 1. @RestController:
// Diz ao Spring: "Esta classe é um 'Controlador de API'.
// Ela vai receber requisições da web."
@RestController
public class StatusController {

    // 2. @GetMapping("/status"):
    // Diz ao Spring: "Quando alguém acessar a URL '/status' (com GET),
    // execute o método logo abaixo."
    @GetMapping("/status")
    public String getStatus() {
        
        // 3. O Retorno:
        // O Spring vai pegar esta String e enviá-la
        // como resposta para o navegador.
        return "API do 'Only Brothers Awards' esta rodando!";
    }

    // Você pode adicionar outro para testar
    @GetMapping("/ola")
    public String getOla() {
        return "Olá, mundo!";
    }
}