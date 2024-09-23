package Exercicios;
public class CarroPrincipal {
    public static void main(String [] args) {
        Carro meuCarro = new Carro();

        meuCarro.modelo = "T-Cross";
        meuCarro.anoFabricado = 2020;
        meuCarro.cor = "Cinza";
        
        meuCarro.exibeFichaTecnica();

        System.out.println("Idade do carro: " + meuCarro.calcularIdade() + " anos");
    }
}
