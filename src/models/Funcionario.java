
package models;
 
public class Funcionario {
    private String nomeFuncionario;
    private int hrTrabalho;
    private String cpf;

    
    public int getHrTrabalho() {
        return hrTrabalho;
    }

    public void setHrTrabalho(int hrTrabalho) {
        this.hrTrabalho = hrTrabalho;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public Funcionario(){
            
    }
              
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

   
       
}
    

