package ex1;

public class Assistente_tecnico extends Assistente {
    private double bonus_salarial;
    public Assistente_tecnico(String nome, double salario, String matricula, double bonus_salarial) {
        super(nome, salario, matricula);
        this.bonus_salarial = bonus_salarial;
    }

    public double getBonus_salarial() {
        return bonus_salarial;
    }

    public void setBonus_salarial(double bonus_salarial) {
        this.bonus_salarial = bonus_salarial;
    }

    @Override
    public double ganho_anual() {
        return (getSalario() + getBonus_salarial()) * 12;
    }

    @Override
    public void exibe_dados() {
        System.out.println("Assistente Tecnico: ");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Matricula: "+ this.getMatricula());
        System.out.println("Salário: "+ this.getSalario());
        System.out.println("Bonus salárial: " + getBonus_salarial());
        System.out.println("Ganho Anual: " + this.ganho_anual());
    }
}
