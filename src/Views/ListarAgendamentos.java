package Views;

import Controllers.AgendamentoController;
import models.Agendamento;

public class ListarAgendamentos {
    
    public static void renderizar(){
        System.out.println("\n".repeat(15));
		System.out.println("\n-- LISTAR Agendamentos --\n");
                int Agendamentos = 0;
		for(Agendamento agendamentoCadastrado : AgendamentoController.listar( )) {
			System.out.println(agendamentoCadastrado);
                        Agendamentos = ++Agendamentos;
		}
                if(Agendamentos == 0){
                    System.out.println("Não tem agendamento!!!");
                }
    }
}
