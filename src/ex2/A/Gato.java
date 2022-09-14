package ex2.A;

public class Gato extends Animal{
    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    public void mia(){
        System.out.println(getNome() + " Está miando !!");
        System.out.println("MIAUUUUUUUUUUUUUU !!");
    }
}
