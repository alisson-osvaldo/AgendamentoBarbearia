
package Views;

import java.util.Scanner;

import Controllers.AgendamentoController;
import models.Agendamento;


public class AgendarServico {
    private static Scanner sc = new Scanner(System.in); 
    private static Agendamento agendamento;

    public static void renderizar(){
        agendamento = new Agendamento();
        
        System.out.println("----AGENDAMENTO DE HORÀRIO----");
        System.out.println("\nInforme o tipo de serviço:");
        String tipoServico = sc.next();
        System.out.println("\nInforme o cpf do cliente:");
        String cpfCliente = sc.next();
        System.out.println("\nInforme o cpf do funcionário:");
        String cpfFuncionario = sc.next();
        System.out.println("\nInforme o dia do agendamento(dd-MM-yyyy):");
        String dia = sc.next();

        AgendamentoController.agendar(tipoServico, cpfCliente, cpfFuncionario, dia);
    }
    
}
