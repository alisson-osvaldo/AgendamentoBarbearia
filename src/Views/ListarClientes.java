
package Views;

import Controllers.ClienteController;
import models.Cliente;

public class ListarClientes {
    public static void renderizar() {
        System.out.println("\n".repeat(15));
        System.out.println("\n-- LISTAR CLIENTES --\n");
        int Clientes = 0;
        for(Cliente clienteCadastrado : ClienteController.listar( )) {
                System.out.println(clienteCadastrado);
                Clientes = ++Clientes;
        }
        if(Clientes == 0){
            System.out.println("Não tem clientes cadastrados!!!");
        }
    }
}
