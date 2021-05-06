
package Controllers;

import java.util.ArrayList;
import models.Funcionario;
import models.Horario;
import models.HorariosDoDia;
import models.TipoServico;

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

    public static Funcionario procurarPorCpf(String cpf){
        for(Funcionario funcionarioCadastrado : funcionarios) {
            if(funcionarioCadastrado.getCpf().equals(cpf)){
                return funcionarioCadastrado;
            }
        }
        return null;
    }

    public static boolean diaEstaDisponivelParaMarcar(Funcionario funcionario, String dia){
        for(HorariosDoDia horariosDiarios : funcionario.getHorariosDisponiveisNoMes()){
            if(horariosDiarios.getDia().equals(dia)) {
                return true;
            }
        }
        return false;
    }

    public static boolean horarioEstaDisponivelParaMarcar(Funcionario funcionario, String dia, int hora, TipoServico tipoServico){
       if(!(diaEstaDisponivelParaMarcar(funcionario, dia))) {
           return false;
       }

        for(HorariosDoDia horariosDiarios : funcionario.getHorariosDisponiveisNoMes()){
            System.out.println(horariosDiarios.getDia());
            System.out.println(horariosDiarios.getDia().equals(dia));
            System.out.println("-----");

            if(horariosDiarios.getDia().equals(dia)) {
                for (Horario horario : horariosDiarios.getHorarios()) {
                    System.out.println(horario.getHora());
                }
            }
        }

       return true;
    }

    public static ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

}
