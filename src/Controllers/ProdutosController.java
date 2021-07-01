package Controllers;

import models.Produto;
import java.util.ArrayList;

public class ProdutosController {
    private static ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    //Listar produtos
    public static ArrayList<Produto> listar(){
        return produtos;
    }
    
    public static boolean cadastrar(Produto produto){
        for(Produto produtoCadastrado : produtos){
            if(produtoCadastrado.getTipo().equals(produto.getTipo())){
                return false;
            }
        }
       produtos.add(produto);
       return true;
    }
    
    public static Produto procurarPorNome(String nomeP){
        for(Produto produtoCadastrado : produtos){
            if(produtoCadastrado.getTipo().equals(nomeP)){
                return produtoCadastrado;
            }
        }
        return null;
    }
}
