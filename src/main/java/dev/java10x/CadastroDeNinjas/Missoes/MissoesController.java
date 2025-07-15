package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController // Indicar para a classe que é uma classe CONTROLLER
@RequestMapping("/missoes")// Indicar que a classe vai ter rotas
public class MissoesController {

    @GetMapping("/listar")
    public String listar(){
        return "Listado de Ninjas";
    }

    @PostMapping("/criar")
    public String criarMissao() {
        return "Criado com sucesso!";
    }

    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Alterado com sucesso!";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Deletado com sucesso!";
    }
}
