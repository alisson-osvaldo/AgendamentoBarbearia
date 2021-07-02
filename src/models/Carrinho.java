package models;

import java.util.ArrayList;

public class Carrinho {

    private static Cliente cliente;
    private static ArrayList<Item> conteudo = new ArrayList<Item>();

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
    }

    public static models.Cliente getCliente() {
        return cliente;
    }

    public static void setCliente(models.Cliente cliente) {
        Carrinho.cliente = cliente;
    }

    public static ArrayList<Item> getConteudo() {
        return conteudo;
    }

    public static void setConteudo(ArrayList<Item> conteudo) {
        Carrinho.conteudo = conteudo;
    }

    public static void exibirItems() {
        System.out.println("Carrinho atual de "+ cliente.getNome());

        for(Item item : conteudo) {
            System.out.println(item.toString());
        }
    }
}
