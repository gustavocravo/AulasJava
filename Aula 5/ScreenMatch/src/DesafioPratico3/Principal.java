package DesafioPratico3;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("iPhone", 5000.0 );

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreço());

        produto.aplicarDesconto(10);
        System.out.println("Preço com desconto: " + produto.getPreço());
        
    }
}
