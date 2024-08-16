public class ContinuacaoAtv1 {
    public static void main(String[] args) {
        int ano = 2022;
        boolean incluidoNoPlano = true;
        double notaFilme = 7.5;
        String tipoPlano = "plus";

        if (ano >= 2022) {
            System.out.println("Lançamento que os clientes estao curtindo!");
        } else {
            System.out.println("Filme antigo que vale a pena assistir");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Pague o aluguel para assistir!");
        }

    }
}
