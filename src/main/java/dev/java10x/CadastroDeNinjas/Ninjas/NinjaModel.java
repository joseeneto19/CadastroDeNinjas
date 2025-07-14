package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Ele transforma uma classe em uma entidade do BD
@Table(name = "tb_cadastro") // Gerar uma tabela no BD
@Data // Lombok cria getters e setters
@NoArgsConstructor // Lombok cria um construtor sem argumentos
@AllArgsConstructor // Lombok cria um construtor com todos os argumentos
public class NinjaModel {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) //Falar que o atributo é um ID // Gerar ID automaticamente
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne //ManyToOne Um ninja tem uma unica missao
    @JoinColumn(name = "missoes_id") // Foreing Key ou chave estrangeira
    private MissoesModel missoes;
}
