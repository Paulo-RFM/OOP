import java.util.Scanner;
public class FuncionariosMain{

    public static void main(String[] args) {

            int dia, ano, i;
            double salario;
            String nome, mes, cargo, matricula;
        
            
            Scanner scanner = new Scanner(System.in);
            FolhaDePagamentoUFV[] folhaDePagamentoUFVs = new FolhaDePagamentoUFV[3];
            Data data = new Data();
            FuncionarioUFV funcionarioUFV = new FuncionarioUFV();
    
    }

    /*public void dadosFuncionarioUFV(){
                
        System.out.println("dia do nasc: ");
        dia = scanner.nextInt();scanner.nextLine();
        data.setDia(dia);

        System.out.println("mes do nasc: ");
        mes = scanner.nextLine();
        data.setMes(mes);

        System.out.println("ano do nasc: ");
        ano = scanner.nextInt();scanner.nextLine();
        data.setAno(ano);

        System.out.println("cargo: ");
        cargo = scanner.nextLine();
        funcionarioUFV.setCargo(cargo);

        System.out.println("matricula: ");
        matricula = scanner.nextLine();
        funcionarioUFV.setMatricula(matricula);

        System.out.println("salario: ");
        salario = scanner.nextDouble();

        System.out.println("dia do pagamento: ");
        dia = scanner.nextInt();scanner.nextLine();

        System.out.println("mes do pagamento");
        mes = scanner.nextLine();

        System.out.println("ano do pagamento");
        ano = scanner.nextInt();scanner.nextLine();

        folhaDePagamentoUFVs[i] = new FolhaDePagamentoUFV(funcionarioUFV, data, salario);
    
    }*/

}
