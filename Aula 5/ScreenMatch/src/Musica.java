public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliarMusica(double nota) {
        somaAvaliacao += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return somaAvaliacao / numAvaliacoes;
    }

}
