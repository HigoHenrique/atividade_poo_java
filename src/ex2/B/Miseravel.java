package ex2.B;

public class Miseravel extends Pessoa {
    private String nome;
    private int idade;

    public Miseravel(String nome,int idade) {
        super(nome, idade);
    }

    public void mendiga(){
        System.out.println("mendigando...");
        System.out.println("mendigando...");
        System.out.println("mendigando...");
        System.out.println("...");
    }
}
