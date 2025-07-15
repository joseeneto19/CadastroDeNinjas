package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController // Indicar para a classe que é uma classe CONTROLLER
@RequestMapping // Indicar que a classe vai ter rotas
public class NinjaController {

    @GetMapping("/boasvindas") // Puxar Informações
    public String boasVindas() {
        return "Primeira rota.";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar") // Metodo POST para a criação de ninja
    public String criarNinja() {
        return "Criado com sucesso!";
    }

   // Mostrar todos os ninjas (READ)
    @GetMapping("/todos") // Metodo GET para mostrar ninjas
    public String todos() {
        return "Todos";
    }
   // Mostrar ninja por ID (READ)
    @GetMapping("/todosID") // Metodo GET para mostrar ninjas por ID
    public String todosID() {
        return "TodosID";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterar") // Metodo PUT para editar o ninja
    public String alterarNinja() {
        return "Alterado com sucesso!";
    }
    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID") // Metodo DELETE para deletar o ninja
    public String deletarNinja() {
        return "Deletado com sucesso!";
    }

}
