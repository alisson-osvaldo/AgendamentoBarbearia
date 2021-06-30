
package Views;

import java.util.Scanner;

import Controllers.FuncionarioController;
<<<<<<< HEAD
=======
import Util.Console;
>>>>>>> 89740b12ab97b931aec16f29b1c7a313b3d66299
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
<<<<<<< HEAD
        System.out.println("\nInforme o cpf do funcionario:");
        newFuncionario.setCpf(sc.next());
=======
        int cpfNumber = Console.lerInteiro("\nInforme o CPF:");
        newFuncionario.setCpf(String.valueOf(cpfNumber));
        System.out.println("\nInforme o endereço:");
        newFuncionario.setEndereco(sc.next());
>>>>>>> 89740b12ab97b931aec16f29b1c7a313b3d66299

        if (FuncionarioController.cadastrar(newFuncionario)) {
            System.out.println("Funcionário cadastrado com sucesso.");
        } else {
            System.out.println("Não foi possível cadastrar o funcionário, CPF já em uso.");
        }
    }
}
