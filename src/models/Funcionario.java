
package models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Funcionario {
    private String nomeFuncionario;
    private String cpf;
    private int horarioInicio;
    private int horarioFim;
    private static ArrayList<HorariosDisponiveisNoDia> horariosDisponiveisNoMes = new ArrayList<HorariosDisponiveisNoDia>();

    public Funcionario(String nomeFuncionario, String cpf, int horarioInicio, int horarioFim) {
        this.nomeFuncionario = nomeFuncionario;
        this.cpf = cpf;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        for (int i = 0; i < 30; i++) {
            SimpleDateFormat dateFormat=new SimpleDateFormat();
            dateFormat.applyPattern("dd-MM-yyyy");

            Calendar c = Calendar.getInstance();
            c.add(Calendar.DAY_OF_YEAR, i);
            Date date = c.getTime();

            HorariosDisponiveisNoDia horarioDia = new HorariosDisponiveisNoDia(dateFormat.format(date));
            horariosDisponiveisNoMes.add(horarioDia);
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static ArrayList<HorariosDisponiveisNoDia> getHorariosDisponiveisNoMes() {
        return horariosDisponiveisNoMes;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nomeFuncionario='" + nomeFuncionario + '\'' +
                ", cpf='" + cpf + '\'' +
                ", horarioInicio=" + horarioInicio +
                ", horarioFim=" + horarioFim +
                '}';
    }
}
    

