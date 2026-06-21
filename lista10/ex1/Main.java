package lista10.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o numero q vc qr");
        int n = tec.nextInt();
        if(n<2){
            System.out.println("N tem numero primo");
            return;
        }
        CalculadoraPrimo p1 = new CalculadoraPrimo(2, n/2);
        CalculadoraPrimo p2 = new CalculadoraPrimo((n/2)+1, n);

        p1.start();
        p2.start();
        
        try{
        p1.join();
        p2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        int resp = p1.getQtdPrimo() + p2.getQtdPrimo();
        System.out.println(resp);

        tec.close();
    }
}
