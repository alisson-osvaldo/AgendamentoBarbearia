
package models;
<<<<<<< HEAD

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Funcionario {
    private String nome;
    private String cpf;

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
=======

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
                   "\nNome: " + getNome() + 
                   "\nCPF: " + getCpf() +
                   "\nEndereco: " + getEndereco();
   }
>>>>>>> 89740b12ab97b931aec16f29b1c7a313b3d66299
}
  

