package ExercicioClasseAbstrata;

public abstract class Gerente extends Funcionario {
    public Gerente(String nome, double salario){
        super(nome, salario);

    }

    @Override
    public void aumentaSalario() {
        setSalario(getSalario()*1.1);

    }
}