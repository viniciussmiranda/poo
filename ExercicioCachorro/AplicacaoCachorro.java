public class AplicacaoCachorro {
    public static void main (String[] args) {
        Cachorro c = new Cachorro("toto", "caramelo");
        Cachorro ca = new CachorroAdestrado("floquinho", "poodle");

        imprime(c);
        imprime(ca);
    }

    public static void imprime(Cachorro c){
        System.out.println("Nome: " + c.getNome());
        System.out.println("Raça: " + c.getRaca());
    }
}