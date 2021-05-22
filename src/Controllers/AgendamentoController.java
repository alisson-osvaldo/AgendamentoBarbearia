
package Controllers;

import models.Agendamento;
import models.Cliente;
import models.Funcionario;
import models.TipoServico;
import java.util.Date;

import java.util.ArrayList;

public class AgendamentoController {
    private static ArrayList<Agendamento> agendamentos = new ArrayList<Agendamento>();

    public static boolean agendar(String tipoServico, String cpfCliente, String cpfFuncionario, Date data){
      Funcionario funcionario = FuncionarioController.procurarPorCpf(cpfFuncionario);
      Cliente cliente = ClienteController.procurarPorCpf(cpfCliente);
      TipoServico servico = ServicoController.procurarPorServico((tipoServico));

      if(servico == null) {
          System.out.println("Não existe um serviço com esse cpf, por favor cadastre um serviço válido");
          return false;
      }

      if(cliente == null) {
        System.out.println("Não existe um cliente com esse cpf, por favor forneça um CPF válido.");
        return false;
      }

      if(funcionario == null) {
        System.out.println("Não existe um funcionário com esse cpf, por favor forneça um CPF válido.");
        return false;
      }

      if(!(horarioEstaDisponivel(funcionario, data))) {
          System.out.println("Esse horário não está disponível, por favor selecione outro horário");
          return false;
      }

      Agendamento agendamento = new Agendamento(cliente, funcionario, servico, data);

      agendamentos.add(agendamento);
      System.out.println("Agendamento cadastrado com sucesso.");
      return true;
    }

    public static boolean horarioEstaDisponivel(Funcionario funcionario, Date data){
        for(Agendamento agendamento : agendamentos) {
            if(agendamento.getFuncionario().equals(funcionario) && agendamento.getData().equals(data)) {
                return false;
            }
        }
        return true;
    }
}
