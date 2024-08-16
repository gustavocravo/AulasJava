import java.util.Scanner;

public class Desafio3M3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular area do quadrado");
            System.out.println("2. Calcular area do ciruclo");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção:");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;

                System.out.println("A area do quadrado é de " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.println("Digite o raio do circulo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("A area do circulo é: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção invalida. Tente novamente.");
            }

        }

    }

}
