
package models;

import java.util.Date;

public class Agendamento {
    private Cliente cliente;
    private Funcionario funcionario;
    private TipoServico tiposervico;
    private Date data;

    public Agendamento(Cliente cliente, Funcionario funcionario, TipoServico tiposervico, Date data) {
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}