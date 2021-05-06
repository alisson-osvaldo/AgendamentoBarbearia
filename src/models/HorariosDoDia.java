package models;
import java.util.ArrayList;

public class HorariosDoDia {
    private String dia;
    private static ArrayList<Horario> horarios = new ArrayList<Horario>();
    private static Horario[] horarios2;


    public HorariosDoDia(String dia, int horarioComeco, int horarioFim) {
        this.dia = dia;
        int cont = 0;
        // Define os horários disponíveis baseado no horário de entrada e saída do funcionário;
        // O que irá definir se um horário é disponível ou não é se existe um agendamento naquele horário
        // Se for null, é um horário disponível, senão, é porque há um agendamento naquele horário
        for (int i = horarioComeco; i <= horarioFim ; i++) {
            cont++;
            Horario horario = new Horario(i);
            horarios.add(horario);
        }
        System.out.println(getHorarios());
    }

    public String getDia() {
        return dia;
    }

    public static ArrayList<Horario> getHorarios() {
        return horarios;
    }
}
