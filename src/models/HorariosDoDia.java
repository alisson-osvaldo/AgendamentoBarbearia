package models;
import java.util.ArrayList;

public class HorariosDoDia {
    private String dia;
    private static ArrayList<Horario> horarios = new ArrayList<Horario>();


    public HorariosDoDia(String dia) {
        this.dia = dia;
        // Define os horários disponíveis baseado no horário de entrada e saída do funcionário;
        // O que irá definir se um horário é disponível ou não é se existe um agendamento naquele horário
        // Se for null, é um horário disponível, senão, é porque há um agendamento naquele horário
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
