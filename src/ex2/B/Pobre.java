package ex2.B;

public class Pobre extends Pessoa{
    private String nome;
    private int idade;

    public Pobre(String nome,int idade) {
        super(nome, idade);
    }

    public void trabalha(){
        System.out.println("Trabalhando...");
        System.out.println("Trabalhando...");
        System.out.println("Trabalhando...");
        System.out.println("Trabalhando...");
        System.out.println("...");
        System.out.println("=(");
    }
}
