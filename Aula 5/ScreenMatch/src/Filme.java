public class Filme {
   String nome;
   int anoLancamento;
   boolean incluidoNoPlano;
   private double somaAvaliacao;
   private int totalAvaliacoes;
   int duracaoMinutos;

   int gettotalAvaliacoes() {
      return totalAvaliacoes;
   }

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
