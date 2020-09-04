import java.util.Scanner;

public class ParOuImparMain {
    public static void main(String[] args) {
        
        final Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
