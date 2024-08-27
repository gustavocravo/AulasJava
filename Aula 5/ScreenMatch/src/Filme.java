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

   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setAno(int anoLancamento) {
      this.anoLancamento = anoLancamento;
   }

   public void setIncluido(boolean incluidoNoPlano) {
      this.incluidoNoPlano = incluidoNoPlano;
   }

   public void setDuracao(int duracaoMinutos) {
      this.duracaoMinutos = duracaoMinutos;
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
