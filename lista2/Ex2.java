
import java.util.Scanner;


public class Ex2{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        float num1 = teclado.nextFloat();
        System.out.println("Digite outro numero");
        float num2 = teclado.nextFloat();
        System.out.println("Digite uma operacao: +, -, *, /");
        char op = teclado.next().charAt(0);
        teclado.nextLine();
        System.out.printf("A resposta e: %.2f \n", Calculadora(num1, num2, op));



        teclado.close();
    }
    public static float Calculadora(float n1, float n2, char operacao){
        float resp = 0.0f;
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