public class MusicaPrincipal {
    public static void main(String [] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.titulo = "The Hills";
        minhaMusica.artista = "The Weekend";
        minhaMusica.anoLancamento = 2015;

        minhaMusica.exibeFichaTecnica();
        minhaMusica.avaliarMusica(9);
        minhaMusica.avaliarMusica(4);
        minhaMusica.avaliarMusica(7);
        minhaMusica.avaliarMusica(10);

        System.out.println("Numero de avaliaçoes: " + minhaMusica.numAvaliacoes);
        System.out.println("Soma de avaliaçoes: " + minhaMusica.somaAvaliacao);
        System.out.println("A media da nota da musica é: " + minhaMusica.pegaMedia());
    }
}
