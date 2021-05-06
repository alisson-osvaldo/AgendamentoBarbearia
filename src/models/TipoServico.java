
package models;

public class TipoServico {
    
    private String tipo;
    private float valor;
    private int duracaoEmHoras;

    public int getDuracaoEmHoras() {
        return duracaoEmHoras;
    }

    public void setDuracaoEmHoras(int duracaoEmHoras) {
        this.duracaoEmHoras = duracaoEmHoras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "TipoServico{" +
                "tipo='" + tipo + '\'' +
                ", valor=" + valor +
                '}';
    }
}
