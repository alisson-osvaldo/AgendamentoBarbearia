package Views;

import java.util.Scanner;
import Util.Console;

import models.Funcionario;
import models.Cliente;
import models.TipoServico;
import models.Agendamento;

import Controllers.ServicoController;
import Controllers.ClienteController;
import Controllers.FuncionarioController;
import Controllers.AgendamentoController;
import java.util.Calendar;

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
                 System.out.println("\n 7- Cadastrar Produto");
                 System.out.println("\n 8- Listar Produtos");
                 System.out.println("\n 9- Comprar produto");
                 System.out.println("\n 10- Finalizar compra");
                 System.out.println("\n 11- TESTAR");
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
                    case 7 : CadastrarProduto.renderizar();
                        break;
                    case 8 : ListarProdutos.renderizar();
                        break;
                     case 9 :
                         ComprarProduto.renderizar();
                         break;
                     case 10 :
                         FinalizarCompra.renderizar();
                         break;
                     case 11 : TESTE_APAGAR_DEPOIS();
                         break;
                 }
                 
             }while(opcao != 0);
             sc.close();
         }
    }

    public static void TESTE_APAGAR_DEPOIS(){
         Funcionario funcionario_teste = new Funcionario();
         funcionario_teste.setCpf("123");
        funcionario_teste.setNome("123");
        funcionario_teste.setTelefone("123");

        Cliente cliente_teste = new Cliente();
        cliente_teste.setCpf("123");
        cliente_teste.setNome("123");
        cliente_teste.setTelefone("123");

        TipoServico servico = new TipoServico();
        servico.setTipo("123");
        servico.setValor(123);

        ServicoController.cadastrar(servico);
        FuncionarioController.cadastrar(funcionario_teste);
        ClienteController.cadastrar(cliente_teste);

        Calendar c = Calendar.getInstance();
        c.set(2021, 8 - 1, 8, 8, 0, 0);
        Agendamento agendamento = new Agendamento(cliente_teste, funcionario_teste, servico, c);

        AgendamentoController.agendar("123", "123", "123", c);

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

-(cadastrarServico; Para cadastrar um Array de serviços)dando a opção do cliente escolher mais de um tipo de serviço
-(uma classe para prudutos e uma para venda de produtos (usando herança))
-(classe: Carrinho; Para somar o valor total dos serviços)Para somar os serviços e compra de Produtos.

*/


