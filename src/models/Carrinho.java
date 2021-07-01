/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author alisson osvaldo
 */
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
