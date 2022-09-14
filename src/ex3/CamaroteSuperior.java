package ex3;

public class CamaroteSuperior extends VIP{
    private String localizacao;

    public CamaroteSuperior(double valor, double valor_adicional, String localizacao) {
        super(valor, valor_adicional);
        this.localizacao = localizacao;
    }

    public double valor_ingresso(){
        return getValor() + getValor_adicional();
    }
}
