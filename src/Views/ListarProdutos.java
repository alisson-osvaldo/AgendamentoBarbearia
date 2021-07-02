package Views;

import Controllers.ProdutosController;
import models.Produto;

public class ListarProdutos {
   
    public static void renderizar(){
        System.out.println("\n".repeat(15));
        System.out.println("\n-- LISTAR Produtos --\n");
        int cadastros = 0;
        for(Produto produtoCadastrado : ProdutosController.listar()){
            System.out.println(produtoCadastrado.toString());
            cadastros = ++cadastros;
        }
        if(cadastros == 0){
            System.out.println("Não tem produtos cadastrados!!!");
        }
    }
}
