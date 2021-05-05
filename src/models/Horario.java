package models;

public class Horario {
    private int hora;
    private Agendamento agendamento;

    public Horario(int hora) {
        this.hora = hora;
        this.agendamento = null;
    }

    public Horario(int hora, Agendamento agendamento) {
        this.hora = hora;
        this.agendamento = agendamento;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    @Override
    public String toString() {
        return "HorarioDia{" +
                "hora=" + hora +
                ", agendamento=" + agendamento +
                '}';
    }
}
