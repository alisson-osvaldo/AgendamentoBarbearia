
package models;


import java.util.Date;


public final class Cliente {
	
    public Cliente( ) {
            setCriadoEm(new Date());
    }

    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private Date   criadoEm;

    public String getEndereco() {
                    return endereco;
    }
    public void setEndereco(String endereco) {
            this.endereco = endereco;
    }
    public String getTelefone() {
            return telefone;
    }
    public void setTelefone(String telefone) {
            this.telefone = telefone;
    }

    public void setNome(String nome) {
            this.nome = nome;
    }
    public String getNome() {
            return this.nome;
    }

    public String getCpf() { 
            return this.cpf;
    }
    public void setCpf(String cpf) {
            this.cpf = cpf;
    }

    public Date getCriadoEm() {
            return criadoEm;
    }
    public void setCriadoEm(Date criadoEm) {
            this.criadoEm = criadoEm;
    }

    @Override
    public String toString() {
            return "Nome: " + getNome() + " | cpf: " + getCpf();
    }
	
}


