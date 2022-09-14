package ex1;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public void exibe_dados(){
        System.out.println("Funcionario: ");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Salário: "+ this.salario);
        System.out.println("Ganho Anual: " + this.ganho_anual());
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double ganho_anual(){
        return getSalario() * 12;
    }

    public double add_aumento(double aumento){
        return this.salario += aumento;
    }
}
