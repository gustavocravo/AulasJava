import java.util.Random;
import java.util.Scanner;

public class JogoAdvinha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;
        //System.out.println(numAleatorio);

        while (tentativas < 5) {
            System.out.println("Advinhe o numero entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numAleatorio) {
                System.out.println("Parabens, voce acertou em " + tentativas + " tentativas");
                break;
            } else if (numeroDigitado < numAleatorio) {
                System.out.println("Numero secreto maior!");
            } else {
                System.out.println("Numero secreto menor");
            }
        }

        if (tentativas == 5 && numeroDigitado != numAleatorio) {
            System.out.println("Numero de tentativas esgotadas. O numero secreto era " + numAleatorio);
        }
    }
}
