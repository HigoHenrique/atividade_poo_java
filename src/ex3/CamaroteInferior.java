package ex3;

public class CamaroteInferior extends VIP{
    private String localizacao;

    public CamaroteInferior(double valor, double valor_adicional, String localizacao) {
        super(valor, valor_adicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void localizacao(){
        System.out.println("a localização fica : " + getLocalizacao());
    }

    public double valor_ingresso(){
        return getValor() + getValor_adicional();
    }
}
