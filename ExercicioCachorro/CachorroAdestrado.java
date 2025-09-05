public class CachorroAdestrado extends Cachorro {
    private boolean frescura;

    public CachorroAdestrado (String nome, String raca, boolean frescura) {
    super(nome, raca);
    this.frescura = frescura;
}
    public get


    public void deitar(){
        System.out.println("Cachorro deitou");
    }

       public void rolar(){
        System.out.println("Cachorro rolou");
    }

       public void fingirDeMorto(){
        System.out.println("Cachorro fingiu de morto");
    }

}