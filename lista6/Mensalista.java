public class Mensalista extends Funcionario{
    
   private String salarioMensal;

    public Mensalista(String salarioMensal){
        this.setSalarioMensal(salarioMensal);
    }

    public String getSalarioMensal() {
        return salarioMensal;
    }
    
    public void setSalarioMensal(String salarioMensal) {
        this.salarioMensal = salarioMensal;
    }


}
