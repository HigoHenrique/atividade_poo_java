package ex1;

import java.util.Locale;

public class Assistente_administrativo extends Assistente{
    private String turno;
    private double adicional_noturno;
    public Assistente_administrativo(String nome, double salario, String matricula, String turno, double adicional_noturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicional_noturno = adicional_noturno;
    }

    public double getAdicional_noturno() {
        return adicional_noturno;
    }

    public void setAdicional_noturno(double adicional_noturno) {
        this.adicional_noturno = adicional_noturno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public double ganho_anual() {
        if (getTurno() == "noite" || getTurno() == "Noite"){
            return (getSalario() + getAdicional_noturno()) * 12;
        }else {
            return getSalario() * 12;
        }
    }
    @Override
    public void exibe_dados() {
        System.out.println("Assistente Administrativo: ");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Matricula: "+ this.getMatricula());
        System.out.println("Turno: "+ this.getTurno());
        System.out.println("Salário: "+ this.getSalario());
        System.out.println("Ganho Anual: " + this.ganho_anual());
    }
}
