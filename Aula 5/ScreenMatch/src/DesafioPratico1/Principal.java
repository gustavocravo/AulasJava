package DesafioPratico1;

public class Principal {
public static void main(String [] args) {
    ContaBancaria conta = new ContaBancaria();

    conta.setNumeroConta(5342342);
    conta.setSaldo(500);
    conta.titular = "Gustavo";

    System.out.println("O nomero da conta é: " + conta.getNumeroConta());
    System.out.println("O saldo da conta é: " + conta.getSaldo());
    System.out.println("O titular da conta é: " + conta.titular);

    conta.setSaldo(1500);
    System.out.println("Novo saldo: " + conta.getSaldo());
}
}
