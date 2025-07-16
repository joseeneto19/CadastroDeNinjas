package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // Criar missão

    public MissoesModel criar(MissoesModel missoes) {
        return missoesRepository.save(missoes);
    }

    // Listar todas as missoes

    public List<MissoesModel> listar() {
        return missoesRepository.findAll();
    }

    // Listar missoes por ID

    public MissoesModel buscarPorId(Long id) {
        Optional <MissoesModel> missoesModel = missoesRepository.findById(id);
        return missoesModel.orElse(null);
    }

    // Deletar missao

    public void deletarMissao(Long id) {
        missoesRepository.deleteById(id);
    }
}
