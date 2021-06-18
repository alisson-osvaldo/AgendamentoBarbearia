package Views;

import Controllers.ProdutosController;
import models.Produto;

public class ListarProdutos {
   
    public static void renderizar(){
        System.out.println("\n".repeat(15));
        System.out.println("\n-- LISTAR Produtos --\n");
        int produtos = 0;
        
        for(Produto produtoCadastrado : ProdutosController.listar()){
            System.out.println(produtoCadastrado);
            produtos = produtos++;
        }if(produtos == 0){
            System.out.println("Não há produtos cadastrado");    
        }
        
    }
}
