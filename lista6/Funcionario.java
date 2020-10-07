public class Funcionario {

    private String nome;
    private int  matricula;


    //construtores
    public Funcionario(String nome, int matricula){
        this.setNome(nome);
        this.setMatricula(matricula);
    }

    public Funcionario(){}

    //métodos get
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    //métodos set
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirDados(){
        System.out.printf("\nNome: %s\n", getNome());
        System.out.printf("Matricula: %d\n", getMatricula());
    }

    public void calcularSalario(){
        System.out.println("0.0");
    }

	public void Funcionario(String nome2, Object ma) {
	}

}
