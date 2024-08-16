import java.util.Scanner;

public class Desafio5M3 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero é par!");
        } else {
            System.out.println("O numero é ímpar!");
        }
    } 

}
