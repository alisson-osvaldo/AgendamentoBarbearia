
package Views;

<<<<<<< HEAD
import java.util.Date;
=======
>>>>>>> 89740b12ab97b931aec16f29b1c7a313b3d66299
import java.util.Scanner;
import java.util.Calendar;

import Controllers.AgendamentoController;
<<<<<<< HEAD
import models.Agendamento;
=======
import Util.Console;
>>>>>>> 89740b12ab97b931aec16f29b1c7a313b3d66299


public class AgendarServico {
    private static Scanner sc = new Scanner(System.in); 
<<<<<<< HEAD

=======
    
>>>>>>> 89740b12ab97b931aec16f29b1c7a313b3d66299
    public static void renderizar(){
        System.out.println("----AGENDAMENTO DE HORÀRIO----");
        System.out.println("\nInforme o tipo de serviço:");
        String tipoServico = sc.next();
<<<<<<< HEAD
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
=======
    //  System.out.println("Deseja agendar outros serviços?");
    
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
>>>>>>> 89740b12ab97b931aec16f29b1c7a313b3d66299

        Calendar c = Calendar.getInstance();
        c.set(ano, mes - 1, dia, hora, 0, 0);

        AgendamentoController.agendar(tipoServico, cpfCliente, cpfFuncionario, c);
<<<<<<< HEAD
=======
        
>>>>>>> 89740b12ab97b931aec16f29b1c7a313b3d66299
    }
    
}
