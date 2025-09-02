import java.util.Scanner;

public class Contas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        ContaPoupanca cp = new ContaPoupanca("João", 123, 1000.0, 5);
        ContaEspecial ce = new ContaEspecial("Maria", 456, 500.0, 200.0f);

        
        cp.depositar(200);
        ce.depositar(300);

        
        cp.sacar(50);
        ce.sacar(600); 

        
        cp.calcularNovoSaldo();

        
        System.out.println("\nDados da Conta Poupança:");
        cp.mostrarDados();

        System.out.println("\nDados da Conta Especial:");
        ce.mostrarDados();

        sc.close();
    }
}
