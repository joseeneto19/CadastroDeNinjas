package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Indicar para a classe que é uma classe CONTROLLER
@RequestMapping("/missoes")// Indicar que a classe vai ter rotas
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping("/listar")
        public List<MissoesModel> listar(){
        return missoesService.listar();
    }

    @GetMapping("/listar/{id}")
    public MissoesModel listarMissaoPorId(@PathVariable Long id){
        return missoesService.buscarPorId(id);
    }

    @PostMapping("/criar")
    public MissoesModel criar(@RequestBody MissoesModel missao) {
        return missoesService.criar(missao);
    }

    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Alterado com sucesso!";
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id) {
        missoesService.deletarMissao(id);
    }
}
