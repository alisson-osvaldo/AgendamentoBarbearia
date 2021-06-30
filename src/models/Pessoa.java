
package models;

import java.util.Date;

public abstract class Pessoa {
   
   public Pessoa(){
       setCriadoEm(new Date());
   }
   
    private String nome;
    private String cpf;
    private String telefone;
    private Date criadoEm;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getTelefone() {
            return telefone;
    }
    public void setTelefone(String telefone) {
            this.telefone = telefone;
    }
    public Date getCriadoEm() {
            return criadoEm;
    }
    public void setCriadoEm(Date criadoEm) {
            this.criadoEm = criadoEm;
    }

    
   

    @Override
    public String toString() {
        return 
          "\nNome :" + getNome() + 
          "\nCPF :" + getCpf() +
          "\nFone: " + getTelefone() +
          "\nCriado em: " + getCriadoEm();
    }


   
   
  
}
