import java.util.Scanner;

public class MainOperacoes{

    public static void main(final String args[]){
         
         double n1, n2;
        
        OperacoesMatematicas operacoes;
        operacoes = new OperacoesMatematicas();

    final Scanner input = new Scanner(System.in);

    n1 = input.nextDouble();
    n2 = input.nextDouble();

    System.out.println("Somar: " +operacoes.somar(n1, n2));
    System.out.println("Media: " +operacoes.media(n1, n2));
    System.out.println("Raiz: " +operacoes.radiciacao(n1, n2));

    }
}
