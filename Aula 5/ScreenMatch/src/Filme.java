public class Filme {
   String nome;
   int anoLancamento;
   boolean incluidoNoPlano;
   double somaAvaliacao;
   int totalAvaliacoes;
   int duracaoMinutos;

   void exibeFichaTecnica() {
      System.out.println("Nome do filme: " + nome);
      System.out.println("Ano de lançamento: " + anoLancamento);
   }

   void avalia(double nota) {
      somaAvaliacao += nota;
      totalAvaliacoes++;
   }

   double pegaMedia() {
      return somaAvaliacao / totalAvaliacoes;
   }
}
