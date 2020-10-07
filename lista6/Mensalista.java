public class Mensalista extends Funcionario{
    
    private double salarioMensal;

    public Mensalista(String nome, int matricula, double salarioMensal){
        super(nome, matricula);
        this.setSalarioMensal(salarioMensal);
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }
    
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.printf("Salario mensal: %.2f", this.calcularSalario(this.getSalarioMensal()));
    }

    public double calcularSalario(double salario){
        return salario;
    }

}
