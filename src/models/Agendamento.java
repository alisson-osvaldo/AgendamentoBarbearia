
package models;

import java.util.Calendar;

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
}