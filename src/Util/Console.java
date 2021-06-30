package Util;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    public static String lerInteiro;
   
    
    //Método para ler apenas valor Int
    public static int lerInteiro(String msg ) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        boolean numeroLido = false;

        do {
                try {
                    System.out.println(msg);
                    //ParseInt é um método que converte uma String para um inteiro
                    valor = Integer.parseInt(sc.next()); //ler em String pq o Scanner nativo do java limpa tudo caso de algum erro mas fica o /n do ENTER
                    numeroLido = true;
                } catch ( NumberFormatException e) {

                        System.out.println("Apenas números!");

                }
        }while(!numeroLido); //enquanto o numeroLido for false
        return valor;
    }
    
//    public static int leOpcao(String msg){
//        Scanner sc = new Scanner(System.in);
//        String op;
//        do{
//            System.out.println("msg");
//            op = sc.NextLine();
//        }while(op != 'S' && op != 'N');
//   }

   
}
