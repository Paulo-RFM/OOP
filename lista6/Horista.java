public class Horista extends Funcionario {
    
    private double valorHora;
    private int numeroHorastrab;
    
    //Contrutores
    public Horista(String nome, int matricula, double valorHora, int numeroHorastrab){
        super.setNome(nome);
        super.setMatricula(matricula);
        setValorHora(valorHora);
        setNumeroHorastrab(numeroHorastrab);
    }

    //metodos set
    public void setNumeroHorastrab(int numeroHorastrab) {
        this.numeroHorastrab = numeroHorastrab;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    //metodos get
    public int getNumeroHorastrab() {
        return numeroHorastrab;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double calcularSalario(double valorHora, int numeroHorastrab){
        double salario = (double) valorHora * numeroHorastrab;
        return salario;
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.printf("Valor da hora: %.2f\nHoras Trabalhadas: %d\n", this.getValorHora(), this.getNumeroHorastrab());
        System.out.printf("Salario: %.2f\n", calcularSalario(getValorHora(), getNumeroHorastrab()));
    }

}
