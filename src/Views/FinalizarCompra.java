package Views;

import Controllers.CarrinhoController;
import Controllers.ClienteController;
import Util.Console;
import models.Cliente;

import java.util.Scanner;

public class FinalizarCompra {

    private static Scanner sc = new Scanner(System.in);

    public static void renderizar(){
        System.out.println("----FINALIZAR COMPRA----");
        int cpfNumber = Console.lerInteiro("Digite o CPF do cliente");
        String cpfCliente = String.valueOf(cpfNumber);

        Cliente cliente = ClienteController.procurarPorCpf(cpfCliente);
        if(cliente == null) {
            System.out.println("Não foi possível encontrar um cliente com esse CPF");
            return;
        }
        CarrinhoController.finalizarCompra(cpfCliente);
    }
}
