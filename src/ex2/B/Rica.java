package ex2.B;

public class Rica extends Pessoa{
    private String nome;
    private int idade;

    public Rica(String nome,int idade) {
        super(nome, idade);
    }

    public void faz_compras(){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("COMPRA COMPRA COMPRA!!");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
    }
}
