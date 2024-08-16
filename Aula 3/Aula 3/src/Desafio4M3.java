import java.util.Scanner;

public class Desafio4M3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multiplicar = 1;

        System.out.println("Diga um numero de 1 a 10:");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do numero " + numero + ":");
        while (multiplicar <= 10) {
            int tabuada = numero * multiplicar++;
            System.out.println(tabuada);
        }
    }
}

//SEGUNDO JEITO//
/*import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
} */
