package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity // Ele transforma uma classe em uma entidade do BD
@Table(name = "tb_missoes") // Gerar uma tabela no BD
public class MissoesModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //Falar que o atributo é um ID // Gerar ID automaticamente
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany (mappedBy = "missoes") // Uma missão para muitos ninjas
    private List<NinjaModel> ninja;
}
