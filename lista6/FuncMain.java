import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class FuncMain {
    
    public static void main(String[] args){
        
        Mensalista[] funcMensal = new Mensalista[150];
        Horista[] funcHorista = new Horista[150];


        double salarioMensal, valorHora;
        String nome;
        int matricula, numeroHorastrab;

        for(int i = 0 ; i < funcMensal.length ; i++){
            funcMensal[i] = dadosFuncMensalista();
            System.out.println();
        }

        for(int i = 0 ; i < funcHorista.length ; i++){
            funcHorista[i] = dadosFuncHorista();
            System.out.println();
        }

        for(int i = 0 ; i < funcMensal.length ; i++){
            funcMensal[i].imprimirDados();
            System.out.println();
        }

        for(int i = 0 ; i < funcHorista.length ; i++){
            funcHorista[i].imprimirDados();
            System.out.println();
        }
        
    }

    static Mensalista dadosFuncMensalista(){
        Scanner input = new Scanner(System.in);
        System.out.print("nome: ");
        String nome = input.nextLine();
        System.out.print("matricula: ");
        int matricula = input.nextInt();
        System.out.print("salario: ");
        double salarioMensal = input.nextDouble();input.nextLine();
        Mensalista funcMensalista = new Mensalista(nome, matricula, salarioMensal);
        return funcMensalista;
    }

    static Horista dadosFuncHorista(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n\nnome: ");
        String nome = input.nextLine();
        System.out.print("matricula: ");
        int matricula = input.nextInt();
        System.out.print("Horas trabalhadas: ");
        int numeroHorastrab = input.nextInt();
        System.out.print("Valor da hora: ");
        double valorHora = input.nextDouble();
        Horista funcHoris = new Horista(nome, matricula, valorHora, numeroHorastrab);
        return funcHoris;
    }

//EXERCICIO 5
        /*

        Mensalista funcMensalista;
        Horista funcHorista;
        
        //mensalista
        System.out.print("nome: ");
        nome = input.nextLine();
        System.out.print("matricula: ");
        matricula = input.nextInt();
        System.out.print("salario: ");
        salarioMensal = input.nextDouble();input.nextLine();
        funcMensalista = new Mensalista(nome, matricula, salarioMensal);
        funcMensalista.imprimirDados();

        //Horista
        System.out.print("\n\nnome: ");
        nome = input.nextLine();
        System.out.print("matricula: ");
        matricula = input.nextInt();
        System.out.print("Horas trabalhadas: ");
        numeroHorastrab = input.nextInt();
        System.out.print("Valor da hora: ");
        valorHora = input.nextDouble();
        funcHorista = new Horista(nome, matricula, valorHora, numeroHorastrab);
        funcHorista.imprimirDados();
        */
}
