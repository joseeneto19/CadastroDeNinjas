package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

@Entity // Ele transforma uma classe em uma entidade do BD
@Table(name = "tb_cadastro") // Gerar uma tabela no BD
public class NinjaModel {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) //Falar que o atributo é um ID // Gerar ID automaticamente
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne //ManyToOne Um ninja tem uma unica missao
    @JoinColumn(name = "missoes_id") // Foreing Key ou chave estrangeira
    private MissoesModel missoes;

    public NinjaModel() {

    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
