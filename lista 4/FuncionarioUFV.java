public class FuncionarioUFV{
    
    private String nome, cargo, matricula;
    private Data dataDeNascimento;
    
    
    public FuncionarioUFV(String nome, String cargo, String matricula, Data data) {
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
        this.dataDeNascimento = data;
    }

    public FuncionarioUFV(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Data getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Data dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }


}