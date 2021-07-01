package Views;

import Controllers.ProdutosController;
import models.Produto;

public class ListarProdutos {
   
    public static void renderizar(){
        System.out.println("\n".repeat(15));
        System.out.println("\n-- LISTAR Produtos --\n");

        for(Produto produtoCadastrado : ProdutosController.listar()){
            System.out.println(produtoCadastrado.toString());
        }
        
    }
}
