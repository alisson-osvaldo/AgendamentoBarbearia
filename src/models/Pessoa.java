
package models;

public abstract class Pessoa {
   
   public Pessoa(){
       
   }
   
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

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

   

    @Override
    public String toString() {
        return 
          "\nNome=" + getNome() + 
          "\nCPF=" + getCpf() +
          "\nEndereço: " + getEndereco() +
          "\nFone: " + getTelefone();
    }


   
   
  
}
