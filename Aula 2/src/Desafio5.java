public class Desafio5 {
    public static void main(String [] args) {
        double valorEmDolares = 50.30;
        
        double conversao = valorEmDolares * 4.94;
        int resultado = (int) conversao;

        String mensagem = "O valor convertido para reais é " + resultado;
        System.out.println(mensagem);
    }

}
