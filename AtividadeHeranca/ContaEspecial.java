public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(String cliente, int num_conta, double saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

   
    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo e limite insuficientes!");
            return false;
        }
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Limite especial: R$ " + limite);
    }
}

