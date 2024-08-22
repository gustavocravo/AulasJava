public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefao";
        meuFilme.anoLancamento = 1970;
        meuFilme.duracaoMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Soma das avaliações: " + meuFilme.somaAvaliacao);
        System.out.println("Total de avaliações: " + meuFilme.totalAvaliacoes);
        System.out.println("Nota media: " + meuFilme.pegaMedia());
    }
}
