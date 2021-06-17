package Views;

import java.util.Scanner;
import Util.Console;

public class Principal {
     public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
             int opcao;
             
             do{
                 System.out.println("----BARBEARIA BIGODON----");
                 
                 System.out.println("\n 1- Cadastrar cliente");
                 System.out.println("\n 2- Listar clientes");
                 System.out.println("\n 3- Cadastrar funcionario");
                 System.out.println("\n 4- Cadastrar Serviço");
                 System.out.println("\n 5- Agendar um serviço");
                 System.out.println("\n 6- Listar serviços agendados");
                 System.out.println("\n 0- Sair");
                 opcao = Console.lerInteiro("\nEscolha uma opção:");
                 
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
                     case 4 :
                         CadastrarServico.renderizar();
                         break;
                     case 5 :
                         AgendarServico.renderizar();
                         break;
                     case 6 :
                         ListarAgendamentos.renderizar();
                         break;
                 }
                 
             }while(opcao != 0);
             sc.close();
         }
    }
    
}

/*  
- tratar exceção na principal, para aceitar apenas Number                    OK
- Mostrar msg caso não tenha Cliente para listar                             OK 
- tratar exceção no cadastro de cliente                                      OK
- tratar exceção no cadastro de funcionario                                  OK
- tratar exceção no cadastro de serviço                                      OK
- tratar exceção no agendamento                                              OK


*
-(classe: Carrinho; Para somar o valor total dos serviços)
-(cadastrarServico; Para cadastrar um Array de serviços) 
*/


