package DesafioPratico2;

public class principal {
    public static void main(String [] args) {
        idadePessoa pessoa1 = new idadePessoa();
        idadePessoa pessoa2 = new idadePessoa();

        pessoa1.setNome("Gustavo");
        pessoa1.setIdade(21);

        pessoa2.setNome("Ana Luisa");
        pessoa2.setIdade(17);


        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        pessoa1.verificarIdade();

        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        pessoa2.verificarIdade();
    }
}
