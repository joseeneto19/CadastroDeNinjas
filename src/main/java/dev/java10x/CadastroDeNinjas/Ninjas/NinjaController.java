package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Indicar para a classe que é uma classe CONTROLLER
@RequestMapping("/ninjas") // Indicar que a classe vai ter rotas
public class NinjaController {

    // Injetar dependencia do NinjaService
    private NinjaService ninjaService;

    // Construtor da dependencia
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    @GetMapping("/listar") // Metodo GET para mostrar ninjas
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }
   // Mostrar ninja por ID (READ)
    @GetMapping("/listar/{id}") // Metodo GET para mostrar ninjas por ID
    public NinjaModel listarNinjasPorId(@PathVariable /* Indica que é uma variavel fornecida pelo USER */ Long id) {
        return ninjaService.listarNinjasPorId(id);
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
