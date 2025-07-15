package dev.java10x.CadastroDeNinjas.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity // Ele transforma uma classe em uma entidade do BD
@Table(name = "tb_missoes") // Gerar uma tabela no BD
@Data // Lombok cria getters e setters
@NoArgsConstructor // Lombok cria um construtor sem argumentos
@AllArgsConstructor // Lombok cria um construtor com todos os argumentos
public class MissoesModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //Falar que o atributo é um ID // Gerar ID automaticamente
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany (mappedBy = "missoes") // Uma missão para muitos ninjas
    @JsonIgnore // Evita o loop infinito da serialização
    private List<NinjaModel> ninja;

}
