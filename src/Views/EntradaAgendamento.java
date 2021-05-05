
package Views;

import java.util.Scanner;
import models.Agendamento;

public class EntradaAgendamento {
    private static Scanner sc = new Scanner(System.in); 
    private static Agendamento agendamento;
   
    
    public static void renderizar(){
        agendamento = new Agendamento();
        
        System.out.println("----AGENDAMENTO DE HORÀRIO----");
        System.out.println("\nInforme o horario:");
        agendamento.setHorario(sc.nextInt());
        System.out.println("\nInforme o dia:");
        agendamento.setData(sc.next());
        System.out.println("\nInforme o tipo de serviço:");
        //agendamento.setTiposervico();
        //mostrar valor do serviço
    }
    
}
