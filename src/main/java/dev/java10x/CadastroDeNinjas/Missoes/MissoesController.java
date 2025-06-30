package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesRepository missoesRepository;

    public MissoesController(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // GET -- Mandar uma requisição para mostar as missoes
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes() {
        return missoesRepository.findAll();
    }

    // POST -- Mandar uma requisição para criar as missoes
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missão criada com sucesso";
    }

    // PUT -- Mandar uma requisição para alterar as missoes
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missão alterada com sucesso";
    }

    // DELETE -- Mandar uma requisição para deletar as missoes
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missão deletada com sucesso";
    }


}
