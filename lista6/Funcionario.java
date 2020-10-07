public class Funcionario {
    protected String nome, matricula;


    //construtores
    public Funcionario(String nome, String matricula){
        this.setNome(nome);
        this.setMatricula(matricula);
    }

    //métodos get
    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    //métodos set
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
