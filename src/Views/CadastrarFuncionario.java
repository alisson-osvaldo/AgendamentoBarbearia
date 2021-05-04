
package Views;

import java.util.Scanner;
import models.Funcionario;

public class CadastrarFuncionario {
    
    private static Scanner sc = new Scanner(System.in); 
    private static Funcionario funcionario;
    
    public static void renderizar(){
        funcionario = new Funcionario();
        System.out.println("----CADASTRAR FUNCIONARIO----");
        System.out.println("\nInforme o nome do funcionario:");
        funcionario.setNomeFuncionario(sc.next());
        System.out.println("\nQual o horario de trabalho:");
        funcionario.setHrTrabalho(sc.nextInt());
    }
}
