package DesafioPratico3;

public class Produto {
    private String nome;
    private double preço;

    public Produto(String nome, double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    void aplicarDesconto(double percentual) {
        double desconto = preço * (percentual / 100);
        preço -= desconto;
    }
}
