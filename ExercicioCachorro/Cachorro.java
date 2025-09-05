public class Cachorro {
    private String nome;
    private String raca;

    public void latir() {
        System.out.println("auau");
    }

    public void dormir() {
        System.out.println("zzzzzz");
    }

    public void comer() {
        System.out.println("hummm");
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }



}