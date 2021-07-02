package Controllers;

import models.Carrinho;
import models.Item;
import models.Cliente;

import java.util.ArrayList;

public class CarrinhoController {
    private static ArrayList<Carrinho> carrinhos = new ArrayList<Carrinho>();

    public static void adicionarAoCarrinho(Item item, Cliente cliente){
        if (acharCarrinhoPorCpfUsuario(cliente.getCpf()) == null) {
            Carrinho novoCarrinho = new Carrinho(cliente);
            novoCarrinho.getConteudo().add(item);
            carrinhos.add(novoCarrinho);
        } else {
            acharCarrinhoPorCpfUsuario(cliente.getCpf()).getConteudo().add(item);
        }
    }

    public static Carrinho acharCarrinhoPorCpfUsuario(String cpf){
        for(Carrinho carrinho : carrinhos) {
            if(carrinho.getCliente().getCpf().equals(cpf)) {
                return carrinho;
            }
        }
        return null;
    }

    public static void imprimirTotal(String cpf){
        Double total = 0.0;
        if (acharCarrinhoPorCpfUsuario(cpf) == null) {
            System.out.println("Total = 0:");
        }else{
            for(Item item : acharCarrinhoPorCpfUsuario(cpf).getConteudo()){
                total = total + item.getValor();
            }
            System.out.println("Total do pedido: " + total);
        }
    }

    public static void limparCarrinho(String cpf){
        carrinhos.remove(acharCarrinhoPorCpfUsuario(cpf));
    }

    public static void finalizarCompra (String cpf){
        if (ClienteController.procurarPorCpf(cpf) == null) {
            System.out.println("Esse usuário não foi encontrado no sistema.");
            return;
        }

       if (acharCarrinhoPorCpfUsuario(cpf) == null) {
            System.out.println("O carrinho desse usuário está vazio");
        }

        imprimirTotal(cpf);
        limparCarrinho(cpf);
    }

}
