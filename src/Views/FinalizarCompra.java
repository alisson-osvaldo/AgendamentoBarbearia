package Views;

import Controllers.CarrinhoController;
import Controllers.ClienteController;
import models.Cliente;

import java.util.Scanner;

public class FinalizarCompra {

    private static Scanner sc = new Scanner(System.in);

    public static void renderizar(){
        System.out.println("----FINALIZAR COMPRA----");
        System.out.println("Digite o CPF do cliente");
        String cpfCliente = sc.next();

        Cliente cliente = ClienteController.procurarPorCpf(cpfCliente);
        if(cliente == null) {
            System.out.println("Não foi possível encontrar um cliente com esse CPF");
            return;
        }
        CarrinhoController.finalizarCompra(cpfCliente);
    }
}
