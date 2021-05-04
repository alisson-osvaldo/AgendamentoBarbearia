
package Views;

import java.util.Scanner;
import models.Cliente;
import Controllers.ClienteController;

public class CadastrarCliente {
    
    private static Scanner sc = new Scanner(System.in); 
    private static Cliente cliente;
    
    public static void renderizar(){
        
        cliente = new Cliente(); 
        System.out.println("------CADASTRAR CLIENTE------");
        System.out.println("\nInforme o nome do cliente:");
        cliente.setNome(sc.next());
        System.out.println("\nInforme o CPF:");
        cliente.setCpf(sc.next());
        System.out.println("\nInforme o endereço:");
        cliente.setEndereco(sc.next());
        System.out.println("\nInforme o telefone:");
        cliente.setTelefone(sc.next());
    
        
        if(ClienteController.cadastrar(cliente)) {
            System.out.println("Cliente cadastrado com sucesso!!!");
        }else {
            System.out.println("Esse cliente já existe!!!");
        }
    
    }
    
}