import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        int n = 1; int soma = 0;
        while(n>0){
            try{
                System.out.println("Digite um numero!");
                n = tec.nextInt();
                soma+=n;
            }catch (InputMismatchException e){
                System.out.println("Entrada invalida");
            }
            tec.nextLine();
        }
        System.out.println("O somatorio e: "+soma);
        tec.close();

    }

}