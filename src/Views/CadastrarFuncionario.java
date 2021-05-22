
package Views;

import java.util.Scanner;

import Controllers.FuncionarioController;
import models.Funcionario;

public class CadastrarFuncionario {
    
    private static Scanner sc = new Scanner(System.in); 
    private static Funcionario newFuncionario;
    private String cpf;

    public static void renderizar(){
        newFuncionario = new Funcionario();
        System.out.println("----CADASTRAR FUNCIONARIO----");
        System.out.println("\nInforme o nome do funcionario:");
        newFuncionario.setNome(sc.next());
        System.out.println("\nInforme o cpf do funcionario:");
        newFuncionario.setCpf(sc.next());

        if (FuncionarioController.cadastrar(newFuncionario)) {
            System.out.println("Funcionário cadastrado com sucesso.");
        } else {
            System.out.println("Não foi possível cadastrar o funcionário, CPF já em uso.");
        }
    }
}
