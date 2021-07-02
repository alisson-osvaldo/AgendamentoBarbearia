package Views;

import Controllers.ProdutosController;
import models.Produto;
import Util.Console;

import java.util.Scanner;

public class CadastrarProduto {
  
    private static Scanner sc = new Scanner(System.in); 
    private static Produto newProduto;
    
    public static void renderizar(){
        newProduto = new Produto();
        System.out.println("");
        System.out.println("----CADASTRAR PRODUTO----");
        System.out.println("\nNome do produto:");
        newProduto.setTipo(sc.next());
        int valorNumber = Console.lerInteiro("\nValor:");
        newProduto.setValor(valorNumber);
        if(ProdutosController.cadastrar(newProduto)){
            System.out.println("Produto cadastrado com sucesso.");
        }else{
            System.out.println("Produto já cadastrado!!!");
        }
        
    }
    
}
