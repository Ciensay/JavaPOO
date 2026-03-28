
import java.util.Scanner;


public class Ex1{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num1 = teclado.nextInt();
        System.out.println("Digite outro numero");
        int num2 = teclado.nextInt();
        System.out.println("Digite uma operacao: +, -, *, /");
        char op = teclado.next().charAt(0);
        teclado.nextLine();
        System.out.printf("A resposta e: %d \n", Calculadora(num1, num2, op));



        teclado.close();
    }
    public static int Calculadora(int n1, int n2, char operacao){
        int resp = 0;
        if(operacao == '+'){
            resp = n1 + n2;
        }else if(operacao == '-'){
            resp = n1-n2;

        }else if(operacao == '/'){
            resp = n1/n2;

        }else if(operacao == '*'){

            resp = n1*n2;
        }
        else{
            System.out.println("operacao invalida");
            
        }

        return resp;

    
    }


}