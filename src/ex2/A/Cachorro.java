package ex2.A;

public class Cachorro extends Animal{

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public void late(){
        System.out.println(getNome() + " Está latindo !!");
        System.out.println("AU AU AU !!");
    }
}
