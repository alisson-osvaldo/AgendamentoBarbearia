
package Controllers;

import java.util.ArrayList;
import models.Funcionario;
import models.HorariosDisponiveisNoDia;

public class FuncionarioController {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
   public static boolean cadastrar(Funcionario funcionario){
       for(Funcionario funcionarioCadastrado : funcionarios) {
            if(funcionarioCadastrado.getCpf().equals(funcionario.getCpf())){
                return false;
            }
        }
        funcionarios.add(funcionario);

       for(Funcionario funcionarioCadastrado : funcionarios) {

           for(HorariosDisponiveisNoDia horariosDisponiveisNoDia : funcionarioCadastrado.getHorariosDisponiveisNoMes()) {
               System.out.println(horariosDisponiveisNoDia.getHorarios());
           }
       }
        return true;
    }

    public static ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
