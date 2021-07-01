
package models;

public class Funcionario extends Pessoa {
   
    public Funcionario(){   
    }
    
    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
     
    @Override
   public String toString() {
           return super.toString() + 
                   "\nNome: " + super.getNome() +
                   "\nCPF: " + super.getCpf() +
                   "\nEndereco: " + getEndereco();
   }
}
  

