public class FilmePrincipal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefao";
        meuFilme.anoLancamento = 1970;
        meuFilme.duracaoMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.gettotalAvaliacoes());
        System.out.println("Nota media: " + meuFilme.pegaMedia());
    }
}
