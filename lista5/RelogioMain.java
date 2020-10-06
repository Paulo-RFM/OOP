import java.util.Scanner;

public class RelogioMain {

    public static void main(String[] args){

        final Scanner input = new Scanner(System.in);
        int hora, minuto, segundo;
        CadastroClientes cliente1 = new CadastroClientes();
        String nome, email;
        System.out.print("nome: ");
        nome = input.nextLine();
        System.out.print("email: ");
        email = input.nextLine();

        cliente1.cadastrarEmail(nome, email);

      /*  hora = input.nextInt();
        minuto = input.nextInt();
        segundo = input.nextInt();

        Tempo tempo2 = new Tempo();
        Tempo tempo3 = new Tempo(hora);
        Tempo tempo4 = new Tempo(hora, minuto);
        Tempo tempo5 = new Tempo(hora, minuto, segundo);
        Tempo tempo1 = new Tempo(pedirDados());

        System.out.println(tempo1.toString());
        System.out.println(tempo2.toString());
        System.out.println(tempo3.toString());
        System.out.println(tempo4.toString());
        System.out.println(tempo5.toString());
    }

    //apenas um teste || Testando método como parametro
    static Tempo pedirDados(){
        Scanner input = new Scanner(System.in);
        int hora, minuto, segundo;

        System.out.print("\n\nhora: ");
        hora = input.nextInt();
        System.out.print("\nminuto: ");
        minuto = input.nextInt();
        System.out.print("\nsegundo: ");
        segundo = input.nextInt();
        Tempo tempo = new Tempo(hora, minuto, segundo);
        return tempo;
    }*/

    
    }
}