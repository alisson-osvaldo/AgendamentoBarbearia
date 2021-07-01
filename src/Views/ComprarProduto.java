package Views;

import Controllers.CarrinhoController;
import Controllers.ProdutosController;
import Controllers.ClienteController;
import models.Carrinho;
import models.Produto;
import models.Cliente;

import java.util.Scanner;

public class ComprarProduto {

    private static Scanner sc = new Scanner(System.in);

    public static void renderizar(){
        System.out.println("----COMPRAR PRODUTO----");
        System.out.println("Digite o CPF do cliente");
        String cpfCliente = sc.next();
        Cliente cliente = ClienteController.procurarPorCpf(cpfCliente);
        if(cliente == null) {
            System.out.println("Não foi possível encontrar um cliente com esse CPF");
            return;
        }
        System.out.println("Digite o nome do produto");
        Produto produto = ProdutosController.procurarPorNome(sc.next());
        if(produto == null) {
            System.out.println("Esse produto não existe;");
            return;
        }
        CarrinhoController.adicionarAoCarrinho(produto, cliente);
        CarrinhoController.acharCarrinhoPorCpfUsuario(cpfCliente).exibirItems();
    }

}
