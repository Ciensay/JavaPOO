import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{


    public static void main(String[] args){

        Scanner tec = new Scanner(System.in);
        float n;
        char op;
        OperacaoMatematica Calc = new OperacaoMatematica();
        while(true){
            try{
                System.out.println("Digite um n!");
                n = tec.nextFloat();
                System.out.println("Digite um operador: +,-,*,/,r");
                op = tec.next().charAt(0);
                //tec.next();
                if(n<0) break;
                Calc.executar(op,n);
                System.out.println("O resultado e: " +Calc.getResultado());
            }catch(InputMismatchException e){
                System.out.println("Entrada invalida! Digita um numero ai paizao");
                break;
            }
        }




        tec.close();
    }
}