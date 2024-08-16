import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Desafio2M3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int primeiro = scanner.nextInt();

        System.out.println("Digite outro numero inteiro: ");
        int segundo = scanner.nextInt();

        if (primeiro == segundo) {
            System.out.println("Os numeros sao iguais!!");
        } else {
            System.out.println("Os numeros sao diferentes!!");
            if (primeiro > segundo) {
                System.out.println("O numero " + primeiro + " é maior do que " + segundo);
            } else {
                System.out.println("O numero " + primeiro + " é menor do que " +segundo);
            }
        } 
    }

}
