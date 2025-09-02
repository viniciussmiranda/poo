package Clientes;

public class Cliente {
    private String nome;
    private String endereco;

    public Cliente(String nome, String end) {
        this.nome = nome;
        this.endereco = end;

    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;

    }

}