package models;

public abstract class Item {

    private float valor;
    private String tipo;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  "Produto: " + tipo + "     Valor: " + valor ;
    }
}
