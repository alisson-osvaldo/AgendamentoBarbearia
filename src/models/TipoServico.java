
package models;

public class TipoServico {
       
    private String tipo;
    private float valor;
    private int duracaoEmHoras;

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

<<<<<<< HEAD
    public int getDuracaoEmHoras() {
        return duracaoEmHoras;
    }

    public void setDuracaoEmHoras(int duracaoEmHoras) {
        this.duracaoEmHoras = duracaoEmHoras;
    }
=======
>>>>>>> 89740b12ab97b931aec16f29b1c7a313b3d66299

    @Override
    public String toString() {
        return "TipoServico{" +
                "tipo='" + tipo + '\'' +
                ", valor=" + valor +
<<<<<<< HEAD
                ", duracaoEmHoras=" + duracaoEmHoras +
=======
>>>>>>> 89740b12ab97b931aec16f29b1c7a313b3d66299
                '}';
    }
}
