package Views;

import java.util.Scanner;
import models.Produto;
import Controllers.ProdutosController;

public class CadastrarProduto {
  
    private static Scanner sc = new Scanner(System.in); 
    private static Produto newProduto;
    
    public static void renderizar(){
        newProduto = new Produto();
        System.out.println("");
        System.out.println("----CADASTRAR PRODUTO----");
        System.out.println("\nNome do produto:");
        newProduto.setNomeP(sc.next());
        System.out.println("\nValor: ");
        newProduto.setValor(sc.nextFloat());
        
        if(ProdutosController.cadastrar(newProduto)){
            System.out.println("Produto cadastrado com sucesso.");
        }else{
            System.out.println("Produto já cadastrado!!!");
        }
        
    }
    
}
