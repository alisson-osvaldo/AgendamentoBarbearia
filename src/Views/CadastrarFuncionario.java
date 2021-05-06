
package Views;

import java.util.Scanner;

import Controllers.FuncionarioController;
import models.Funcionario;

public class CadastrarFuncionario {
    
    private static Scanner sc = new Scanner(System.in); 
    private static Funcionario newFuncionario;
    private String cpf;

    public static void renderizar(){
        System.out.println("----CADASTRAR FUNCIONARIO----");
        System.out.println("\nInforme o nome do funcionario:");
        String nome = sc.next();
        System.out.println("\nInforme o cpf do funcionario:");
        String cpf = sc.next();
        System.out.println("\nInforme o horário de entrada do funcionário:");
        int horarioInicio = 10; // ALTERAR
        System.out.println("\nInforme o horário de saída do funcionário:");
        int horarioFim = 15; // ALTERAR

        newFuncionario = new Funcionario(nome, cpf, horarioInicio, horarioFim);
        FuncionarioController.cadastrar(newFuncionario);

        System.out.println(newFuncionario);
    }
}
