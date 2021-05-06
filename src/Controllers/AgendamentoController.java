
package Controllers;

import models.Agendamento;
import models.Cliente;
import models.Funcionario;
import models.TipoServico;

import java.util.ArrayList;

public class AgendamentoController {
    private static ArrayList<Agendamento> agendamentos = new ArrayList<Agendamento>();

    public static boolean agendar(String tipoServico, String cpfCliente, String cpfFuncionario, String dia){
        TipoServico tipoServicoProcurado = ServicoController.procurarPorServico(tipoServico);
        Cliente cliente = ClienteController.procurarPorCpf(cpfCliente);
        Funcionario funcionario = FuncionarioController.procurarPorCpf(cpfFuncionario);

        FuncionarioController.horarioEstaDisponivelParaMarcar(funcionario, "09-05-2021", tipoServicoProcurado.getDuracaoEmHoras(), tipoServicoProcurado);

        if(tipoServicoProcurado == null) {
            System.out.println("Não existe um serviço com esse nome, não foi possível realizar o agendamento.");
            return false;
        }

        if(cliente == null) {
            System.out.println("Não existe um cliente com esse CPF, não foi possível realizar o agendamento.");
            return false;
        }

        if(funcionario == null) {
            System.out.println("Não existe um funcionário com esse CPF, não foi possível realizar o agendamento.");
            return false;
        }

        if(!(FuncionarioController.diaEstaDisponivelParaMarcar(funcionario,dia))) {
            System.out.println("Não existe um horário disponível para o horário marcado, não foi possível realizar o agendamento.");
        }

        return true;
    }
}
