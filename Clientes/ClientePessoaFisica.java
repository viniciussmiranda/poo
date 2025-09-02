package Clientes;

public class ClientePessoaFisica extends Cliente {
    private String cpf;

    public ClientePessoaFisica (String nome, String end, String cpf) {
        super(nome, end);
        this.cpf = cpf;

    }

    public String getEndereco() {
        return super.getEndereco();
    }

    public void setEndereco(String endereco) {
        super.setEndereco(endereco);

    }

}

