
package models;

import java.util.Calendar;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;

public class Agendamento {
    private Cliente cliente;
    private Funcionario funcionario;
    private TipoServico tiposervico;
    private Calendar data;

    public Agendamento(Cliente cliente, Funcionario funcionario, TipoServico tiposervico, Calendar data) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.tiposervico = tiposervico;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public TipoServico getTiposervico() {
        return tiposervico;
    }

    public void setTiposervico(TipoServico tiposervico) {
        this.tiposervico = tiposervico;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    @Override
    public String toString() {

        TimeZone tz = data.getTimeZone();
        ZoneId zoneId = tz.toZoneId();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(data.toInstant(), zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        return "\nCliente : " + this.cliente.getNome() + 
               "\nAtendente : " + this.funcionario.getNome()+ 
                "\nServico : " + this.tiposervico.getTipo() + "  |  Valor: " + this.tiposervico.getValor() +
                "\nData e horario do agendamento : " + localDateTime.format(formatter);
    }
    
    
}