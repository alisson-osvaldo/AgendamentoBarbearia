package models;

public class Produto {
    
    private String nomeP;
    private Float valor;

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\nProduto : " + nomeP + 
               "\nValor : " + valor;
    }
    
    
}
