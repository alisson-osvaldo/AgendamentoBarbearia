package models;
import java.util.ArrayList;

public class HorariosDoDia {
    private String dia;
    private static ArrayList<Horario> horarios = new ArrayList<Horario>();

    public HorariosDoDia(String dia) {
        this.dia = dia;
        for (int i = 8; i <= 17 ; i++) {
            Horario horario = new Horario(i);
            horarios.add(horario);
        }
    }

    public String getDia() {
        return dia;
    }

    public static ArrayList<Horario> getHorarios() {
        return horarios;
    }
}
