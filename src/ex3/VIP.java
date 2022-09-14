package ex3;

public class VIP extends Ingresso{
    private double valor_adicional;
    public VIP(double valor, double valor_adicional) {
        super(valor);
        this.valor_adicional = valor_adicional;
    }

    public double getValor_adicional() {
        return valor_adicional;
    }

    @Override
    public void imprime_valor() {
        System.out.println("valor do ingresso: " +"R$"+ (getValor() + getValor_adicional()));
    }


}
