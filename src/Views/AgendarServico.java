
package Views;

import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

import Controllers.AgendamentoController;
import models.Agendamento;


public class AgendarServico {
    private static Scanner sc = new Scanner(System.in); 

    public static void renderizar(){
        System.out.println("----AGENDAMENTO DE HORÀRIO----");
        System.out.println("\nInforme o tipo de serviço:");
        String tipoServico = sc.next();
        System.out.println("\nInforme o cpf do cliente:");
        String cpfCliente = sc.next();
        System.out.println("\nInforme o cpf do funcionário:");
        String cpfFuncionario = sc.next();
        System.out.println("\nInforme o ano do agendamento");
        int ano = sc.nextInt();
        System.out.println("\nInforme o mês do agendamento");
        int mes = sc.nextInt();
        System.out.println("\nInforme o dia do agendamento");
        int dia = sc.nextInt();
        System.out.println("\nInforme a hora do agendamento");
        int hora = sc.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(ano, mes - 1, dia, hora, 0, 0);

        Date data = c.getTime();

        AgendamentoController.agendar(tipoServico, cpfCliente, cpfFuncionario, data);
    }
    
}
