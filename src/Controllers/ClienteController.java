
package Controllers;

import java.util.ArrayList;
import models.Cliente;

public class ClienteController {
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public static ArrayList<Cliente> listar() {
	return clientes; 
    }

    public static boolean cadastrar(Cliente cliente) {
        for(Cliente clienteCadastrado : clientes) {
            if(clienteCadastrado.getCpf().equals(cliente.getCpf())){
                return false;
            }
        }
    
    clientes.add(cliente);
    return true;
    }

    public static Cliente procurarPorCpf(String cpf){
        for(Cliente clienteCadastrado : clientes) {
            if(clienteCadastrado.getCpf().equals(cpf)){
                return clienteCadastrado;
            }
        }
        return null;
    }
    
    
}
