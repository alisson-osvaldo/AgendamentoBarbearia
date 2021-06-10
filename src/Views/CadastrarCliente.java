
package Views;

import java.util.Scanner;
import models.Cliente;
import Controllers.ClienteController;
import Util.Console;

public class CadastrarCliente {
    
    private static Scanner sc = new Scanner(System.in); 
    private static Cliente cliente;
    
    public static void renderizar(){
        
        cliente = new Cliente(); 
        System.out.println("------CADASTRAR CLIENTE------");
        System.out.println("\nInforme o nome do cliente:");
        cliente.setNome(sc.next());
        int cpfNumber = Console.lerInteiro("\nInforme o CPF:");
        cliente.setCpf(String.valueOf(cpfNumber)); //convertendo um Int para String
        System.out.println("\nInforme o endereço:");
        cliente.setEndereco(sc.next());
        int telefoneNumber = Console.lerInteiro("\nInforme o telefone:");
        cliente.setTelefone(String.valueOf(telefoneNumber));
    
        
        if(ClienteController.cadastrar(cliente)) {
            System.out.println("Cliente cadastrado com sucesso!!!");
        }else {
            System.out.println("Esse cliente já existe!!!");
        }
    
    }
    
}