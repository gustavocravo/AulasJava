public class Desafio6 {
    public static void main(String [] args) {
        double precoOriginal = 40.50;
        double percentualDesconto = 10;

        double valorDesconto = (precoOriginal * percentualDesconto) /100;
        double total = precoOriginal - valorDesconto;

        String mensagem = "O valor com desconto é de R$" + total;

        System.out.println("O preço original é de R$" + precoOriginal);
        System.out.println("O valor do desconto é de R$" + valorDesconto);
        System.out.println(mensagem);
    }

}
