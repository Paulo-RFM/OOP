import java.util.Scanner;
public class FuncionariosMain{
           
    public static void main(String[] args) {
        FolhaDePagamentoUFV[] folhaDePagamentoUFVs = new FolhaDePagamentoUFV[3];

        lerDados(folhaDePagamentoUFVs);        
        
        imprimirDados(folhaDePagamentoUFVs);
    
    }        

    public static void lerDados(FolhaDePagamentoUFV[] folhaDePagamentoUFVs){
        int dia, ano;
        double salario;
        String nome, mes, cargo, matricula;        
        Scanner scanner = new Scanner(System.in);
        FuncionarioUFV funcionarioUFV;
        Data data;

        for(int i = 0 ; i < folhaDePagamentoUFVs.length ; i++){
            System.out.printf("\n\nFuncionario [%d]\n", i+1);
            System.out.println("dia do nasc: ");
            dia = scanner.nextInt();scanner.nextLine();
    
            System.out.println("mes do nasc: ");
            mes = scanner.nextLine();
    
            System.out.println("ano do nasc: ");
            ano = scanner.nextInt();scanner.nextLine();

            data = new Data(dia, mes, ano);
    
            System.out.println("nome: ");
            nome = scanner.nextLine();

            System.out.println("cargo: ");
            cargo = scanner.nextLine();
    
            System.out.println("matricula: ");
            matricula = scanner.nextLine();
    
            System.out.println("salario: ");
            salario = scanner.nextDouble();

            funcionarioUFV = new FuncionarioUFV(nome, cargo, matricula, data);
    
            System.out.println("dia do pagamento: ");
            dia = scanner.nextInt();scanner.nextLine();
    
            System.out.println("mes do pagamento");
            mes = scanner.nextLine();
    
            System.out.println("ano do pagamento");
            ano = scanner.nextInt();scanner.nextLine();
    
            folhaDePagamentoUFVs[i] = new FolhaDePagamentoUFV(funcionarioUFV, data, salario);

        
        }
    }

    public static void imprimirDados(FolhaDePagamentoUFV[] folhaDePagamentoUFVs){
        for(int i = 0 ; i < folhaDePagamentoUFVs.length ; i++){
            folhaDePagamentoUFVs[i].imprimirDados();
        }
    }

}
