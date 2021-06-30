package Views;

import Controllers.ServicoController;
<<<<<<< HEAD
=======
import Util.Console;
>>>>>>> 89740b12ab97b931aec16f29b1c7a313b3d66299
import models.TipoServico;

import java.util.Scanner;

public class CadastrarServico {
    private static Scanner sc = new Scanner(System.in);
    private static TipoServico tipoServico;

    public static void renderizar(){
        tipoServico = new TipoServico();
<<<<<<< HEAD

        System.out.println("----CADASTRAR FUNCIONARIO----");
        System.out.println("\nInforme o tipo do serviço");
        tipoServico.setTipo(sc.next());
        System.out.println("\nInforme o valor do serviço:");
        tipoServico.setValor(sc.nextFloat());
=======
        
        System.out.println("----CADASTRAR FUNCIONARIO----");
        System.out.println("\nInforme o tipo do serviço");
        tipoServico.setTipo(sc.next());
        int valorNumber = Console.lerInteiro("\nInforme o valor do serviço:");
        tipoServico.setValor(Float.valueOf(valorNumber));
>>>>>>> 89740b12ab97b931aec16f29b1c7a313b3d66299
        if(ServicoController.cadastrar(tipoServico)) {
            System.out.println("Serviço cadastrado com sucesso!!!");
        }else {
            System.out.println("Um serviço com esse nome já existe!!!");
        }
    }

}
