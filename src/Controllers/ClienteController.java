
package Controllers;

import java.util.ArrayList;
import models.Cliente;

public class ClienteController {
    //Método que recebe uma ArrayList de Cliente
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    //Método para listar cliente
    public static ArrayList<Cliente> listar() {
	return clientes; 
    }
    
    //Método para cadastrar e validar cpf
    public static boolean cadastrar(Cliente cliente) {
        for(Cliente clienteCadastrado : clientes) {
            if(clienteCadastrado.getCpf().equals(cliente.getCpf())){
                return false;
            }
        }
    
    clientes.add(cliente);
    return true;
    }
}
