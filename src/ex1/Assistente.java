package ex1;

public class Assistente extends Funcionario {
    private String matricula;

    public Assistente(String nome, double salario, String matricula) {
        super(nome,salario);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibe_dados() {
        System.out.println("Assistente: ");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Matricula: "+ this.matricula);
        System.out.println("Salário: "+ this.getSalario());
        System.out.println("Ganho Anual: " + this.ganho_anual());
    }
}

