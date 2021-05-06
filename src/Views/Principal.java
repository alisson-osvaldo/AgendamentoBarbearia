package Views;
import Views.CadastrarCliente;
import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("----BARBEARIA BIGODON----");
            
            System.out.println("\n 1- Cadastrar cliente");
            System.out.println("\n 2- Listar clientes");
            System.out.println("\n 3- Cadastrar funcionario");
            System.out.println("\nEscolha uma opcão");
            opcao = sc.nextInt();
            
            
            switch (opcao) {
                case 1 :
                    CadastrarCliente.renderizar();
                    break;
                case 2:
                    ListarClientes.renderizar();
                    break;
                case 3 :
                    CadastrarFuncionario.renderizar();
                    break;
            
            }
            
        }while(opcao != 0);
    }
    
}
