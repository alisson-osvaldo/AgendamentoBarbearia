
package Controllers;

import java.util.ArrayList;
import models.Funcionario;

public class FuncionarioController {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
   public static boolean cadastrar(Funcionario funcionario){
       for(Funcionario funcionarioCadastrado : funcionarios) {
            if(funcionarioCadastrado.getCpf().equals(funcionario.getCpf())){
                return false;
            }
        }
        funcionarios.add(funcionario);
        return true;
    }

    public static ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

}
