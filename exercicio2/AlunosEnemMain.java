
import java.util.Arrays;
import java.util.Scanner;

public class AlunosEnemMain {
    
    public static void main(String[] args){

        final Scanner input = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];
        instanciaAlunos(alunos);

        String nome;
        double nota;

        for(int i = 0 ; i < 3 ; i++){
            System.out.print("Nome: ");
            nome = input.nextLine();
            alunos[i].setNome(nome);

            System.out.print("nota:");
            nota = input.nextDouble(); input.nextLine();
            alunos[i].setNota(nota);
            
            System.out.println();
        }

        Arrays.sort(alunos);

        System.out.println(alunos[0].getNota());
        
    }

    public static void instanciaAlunos(Aluno[] alunos){
        for(int i = 0 ; i < alunos.length ; i++){
            alunos[i] = new Aluno();
        }
    }
}
