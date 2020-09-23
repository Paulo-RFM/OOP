
public class FolhaDePagamentoUFV {
    
    private FuncionarioUFV funcionario;
    private Data dataDePagamento;
    private Double totalDeVencimentos;

    public FolhaDePagamentoUFV(FuncionarioUFV funcionario, Data dataDePagamento, Double totalDeVencimentos) {
        this.funcionario = funcionario;
        this.dataDePagamento = dataDePagamento;
        this.totalDeVencimentos = totalDeVencimentos;
    }
    
    public FuncionarioUFV getFuncionario() {
        return funcionario;
    }
    
    public void setFuncionario(FuncionarioUFV funcionario) {
        this.funcionario = funcionario;
    }

    public Data getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(Data dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }

    public Double getTotalDeVencimentos() {
        return totalDeVencimentos;
    }

    public void setTotalDeVencimentos(Double totalDeVencimentos) {
        this.totalDeVencimentos = totalDeVencimentos;
    }

    

    public void imprimirDados(){
        System.out.printf("data de nascimento:%d, %s, %d\n", funcionario.getDataDeNascimento().getDia(), funcionario.getDataDeNascimento().getMes(), funcionario.getDataDeNascimento().getAno());
        System.out.println("cargo: " +funcionario.getCargo());
        System.out.println("matricula: " +funcionario.getMatricula());
        System.out.println("Salario: " +this.totalDeVencimentos);
    }

    

}
