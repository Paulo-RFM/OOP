import java.util.Scanner;

public class MainPessoas {

    

    public static void main(String[] args) {

        Pessoa p1, p2;
        int idade;

        Scanner input =  new Scanner(System.in);

        p1 = new Pessoa();
        p2 = new Pessoa();

        idade = input.nextInt();
        
        p1.setIdade(idade);
        System.out.println(p1.getIdade());

        idade = input.nextInt();
        p2.setIdade(idade);
        System.out.println(p2.getIdade());

    }
}
