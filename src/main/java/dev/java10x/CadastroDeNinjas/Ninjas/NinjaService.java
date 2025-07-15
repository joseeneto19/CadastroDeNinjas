package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica que é uma classe para o Service
public class NinjaService {

    // Injeta a dependencia
    private NinjaRepository ninjaRepository;

    // Construtor da dependencia
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os meus ninjas
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }


}
