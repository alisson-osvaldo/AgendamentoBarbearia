
package models;

public class Funcionario extends Pessoa {
   
    @Override
   public String toString() {
           return super.toString() + 
                   "\nNome: " + getNome() + 
                   "\nCPF: " + getCpf();
   }
}
  

