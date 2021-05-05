package models;
import java.util.ArrayList;

public class HorariosDisponiveisNoDia {
    private String dia;
    private static ArrayList<HorarioDia> horarios = new ArrayList<HorarioDia>();

    public HorariosDisponiveisNoDia(String dia) {
        this.dia = dia;
        for (int i = 8; i <= 17 ; i++) {
            HorarioDia horario = new HorarioDia(i);
            horarios.add(horario);
        }
    }

    public String getDia() {
        return dia;
    }

    public static ArrayList<HorarioDia> getHorarios() {
        return horarios;
    }
}
