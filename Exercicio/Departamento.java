package Exercicio;

public class Departamento {
    private int codigo;
    private String nome;

    public Departamento(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }



    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;

    }

    public void setCodigo(int cod) {
        if (cod > 0) 
            codigo = cod;
         else
        System.out.println("CÓDIGO TEM QUE SER POSITIVO");
    }    


    public void setNome(String n) {
        if (!n.isEmpty() && !n.isBlank())
        nome = n;
        else 
        System.out.println("NÃO PODE SER VAZIO");
    }

}
