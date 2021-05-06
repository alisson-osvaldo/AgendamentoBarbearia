package models;
import java.util.ArrayList;

public class HorariosDoDia {
    private String dia;
    private static ArrayList<Horario> horarios = new ArrayList<Horario>();


    public HorariosDoDia(String dia, int horarioComeco, int horarioFim) {
        int cont = 0;

        this.dia = dia;
        // Define os horários disponíveis baseado no horário de entrada e saída do funcionário;
        // O que irá definir se um horário é disponível ou não é se existe um agendamento naquele horário
        // Se for null, é um horário disponível, senão, é porque há um agendamento naquele horário
        int intArray[];
        intArray = new int[24];
        for (int i = horarioComeco; i <= horarioFim ; i++) {
            if(intArray == null) {
                intArray[i] = i;
                Horario horario = new Horario(i);
                cont++;
                horarios.add(horario);
            } else {
                boolean jaEstaNaLista = false;
                for (int j = 0; j < intArray.length; j++) {
                    if (intArray[j] == i) {
                        jaEstaNaLista = true;
                    }
                }
                if(!(jaEstaNaLista)) {
                    intArray[i] = i;
                    Horario horario = new Horario(i);
                    cont++;
                    horarios.add(horario);
                }
            }
        }


    }

    public String getDia() {
        return dia;
    }

    public static ArrayList<Horario> getHorarios() {
        return horarios;
    }
}
