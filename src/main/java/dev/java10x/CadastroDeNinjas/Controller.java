package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indicar para a classe que é uma classe CONTROLLER
@RequestMapping // Indicar que a classe vai ter rotas
public class Controller {

    @GetMapping("/boasvindas") // Puxar Informações
    public String boasVindas() {
        return "Primeira rota.";
    }

}
