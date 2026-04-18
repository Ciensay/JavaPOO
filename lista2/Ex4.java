

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner tec  = new Scanner(System.in);
        System.out.println("Digite a distancia percorrida");
        int distancia = tec.nextInt();
        System.out.println("Digite o tempo gasto");
        int tempo = tec.nextInt();
        System.out.println("Digite a gasolina combustivel");
        int combustivel = tec.nextInt();
        System.out.printf("A velocidade media e: %d \n", CalcVel(distancia, tempo));
        System.out.printf("O gasto medio e: %d \n", CalcCombu(distancia, combustivel));


        tec.close();
    }
    public static int CalcCombu(int Km, int Litros){

        return Km/Litros;
    }
    public static int CalcVel(int Km, int t){

        return Km/t;
    }
    
}
