public class ContaBancaria {
    protected String cliente;
    protected int num_conta;
    protected double saldo;

    
    public ContaBancaria(String cliente, int num_conta, double saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

   
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

  
    public void depositar(double valor) {
        saldo += valor;
    }

    
    public void mostrarDados() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Número da conta: " + num_conta);
        System.out.println("Saldo: R$ " + saldo);
    }

   
    public double getSaldo() {
        return saldo;
    }
}
