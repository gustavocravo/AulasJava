package Exercicios;
public class Carro {
    String modelo;
    int anoFabricado;
    String cor;

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + anoFabricado);
        System.out.println("Cor: " + cor);
    }

    double calcularIdade() {
       return 2024 - anoFabricado;
    }

}
