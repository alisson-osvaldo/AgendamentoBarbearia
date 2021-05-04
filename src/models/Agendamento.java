
package models;

import java.util.Date;

public class Agendamento {
    public Agendamento( ) {
		setCriadoEm(new Date());
	}
	
	private Cliente cliente;
        private Funcionario funcionario; 
	private String horario;
	private Date data;
	private String tipoCorte;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipoCorte() {
        return tipoCorte;
    }

    public void setTipoCorte(String tipoCorte) {
        this.tipoCorte = tipoCorte;
    }
                
   

    private void setCriadoEm(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
