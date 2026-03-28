//package lista2;

import java.util.Scanner;

public class Ex3{
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite os segundos");
        int sec = tec.nextInt();
        imprime_conversor(sec);
        tec.close();
    }
    public static void imprime_conversor(int n){
        int minuto = n/60;
        int hora = n/3600;
        System.out.printf("Em segundos fica: %d", n);
        System.out.printf("\nEm minutos fica: %d", minuto);
        System.out.printf("\nEm horas fica: %d \n", hora);

    }
}
