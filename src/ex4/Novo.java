package ex4;

public class Novo extends Imovel{
    private double valor_adicional;
    public Novo(String endereco, double preco, double valor_adicional) {
        super(endereco, preco);
        this.valor_adicional = valor_adicional;
    }

    public double getValor_adicional() {
        return valor_adicional;
    }

    public void setValor_adicional(double valor_adicional) {
        this.valor_adicional = valor_adicional;
    }

    public double preco_com_adicional(){
        return this.getPreco() + this.getValor_adicional();
    }
}
