import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        String destinatario;
        Scanner scan = new Scanner(System.in);

        CartaoWeb[] cartoes = new CartaoWeb[3];

        destinatario = scan.nextLine();
        cartoes[0] = new CartaoAniversario(destinatario);

        destinatario = scan.nextLine();
        cartoes[1] = new CartaoDiaDosNamorados(destinatario);

        destinatario = scan.nextLine();
        cartoes[2] = new CartaoNatal(destinatario);

        System.out.println();

        for(int i = 0 ; i < cartoes.length ; i++){
            System.out.println(cartoes[i].retornarMensagem("Paulo"));
            System.out.println();
        }

    }
}
