
package Views;

import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

import Controllers.AgendamentoController;
import Util.Console;
import models.Agendamento;


public class AgendarServico {
    private static Scanner sc = new Scanner(System.in); 
    
    public static void renderizar(){
        System.out.println("----AGENDAMENTO DE HORÀRIO----");
        System.out.println("\nInforme o tipo de serviço:");
        String tipoServico = sc.next();
    //    System.out.println("Deseja agendar outros serviços?");
            
        int cpfClient = Console.lerInteiro("\nInforme o CPF do cliente:");
        String cpfCliente = String.valueOf(cpfClient);
        int cpfFun = Console.lerInteiro("\nInforme o CPF do funcionário:");
        String cpfFuncionario = String.valueOf(cpfFun);
        int dtAno = Console.lerInteiro("\nInforme o ano do agendamento:");
        int ano = dtAno;
        int dtMes = Console.lerInteiro("\nInforme o mês do agendamento:");
        int mes = dtMes;
        int dtDia = Console.lerInteiro("\nInforme o dia do agendamento:");
        int dia = dtDia;
        int hr = Console.lerInteiro("\nInforme a hora do agendamento:");
        int hora = hr;

        Calendar c = Calendar.getInstance();
        c.set(ano, mes - 1, dia, hora, 0, 0);

        AgendamentoController.agendar(tipoServico, cpfCliente, cpfFuncionario, c);
        
    }
    
}
