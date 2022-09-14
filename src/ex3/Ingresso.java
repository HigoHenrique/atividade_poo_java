package ex3;
import java.text.NumberFormat;
import java.util.Locale;

public class Ingresso {
    private double valor;

    public Ingresso(double valor){
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprime_valor(){
        Locale ptBr = new Locale("pt", "BR");
        String valorString = NumberFormat.getCurrencyInstance(ptBr).format(this.getValor());
        System.out.println(valorString);
    }
}
