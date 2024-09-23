package Exercicios;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Calculadora {
    Scanner valor = new Scanner(System.in);

    void calcular() {
        System.out.println("Digite um numero: ");
        double numero = valor.nextDouble();

        double resultado = numero * 2;

        System.out.println("O dobro de " + numero + " é: " + resultado);
    }
}
