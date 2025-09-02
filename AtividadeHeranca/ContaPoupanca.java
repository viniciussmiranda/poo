public class ContaPoupanca extends ContaBancaria {
    private int diaDeRendimento;

   
    public ContaPoupanca(String cliente, int num_conta, double saldo, int diaDeRendimento) {
        super(cliente, num_conta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

   
    public void calcularNovoSaldo() {
        double rendimento = saldo * 0.005; // 0,5%
        saldo += rendimento;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Dia de rendimento: " + diaDeRendimento);
    }
}
