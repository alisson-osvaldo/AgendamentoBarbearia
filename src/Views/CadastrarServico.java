package Views;

import Controllers.ServicoController;
import models.TipoServico;

import java.util.Scanner;

public class CadastrarServico {
    private static Scanner sc = new Scanner(System.in);
    private static TipoServico tipoServico;

    public static void renderizar(){
        tipoServico = new TipoServico();

        System.out.println("----CADASTRAR FUNCIONARIO----");
        System.out.println("\nInforme o tipo do serviço");
        tipoServico.setTipo(sc.next());
        System.out.println("\nInforme o valor do serviço:");
        tipoServico.setValor(sc.nextFloat());
        System.out.println("\nInforme a duração em horas desse serviço:");
        tipoServico.setDuracaoEmHoras(sc.nextInt());
        if(ServicoController.cadastrar(tipoServico)) {
            System.out.println("Serviço cadastrado com sucesso!!!");
        }else {
            System.out.println("Um serviço com esse nome já existe!!!");
        }
    }

}
