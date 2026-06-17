package Ex3;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o tempo em segundos");
        int sec = tec.nextInt();
        ConverteTempo conversor = new ConverteTempo(sec);
        System.out.println("O tempo em segundos e "+sec);
        System.out.println("O tempo em minutos e "+conversor.getMinutos());
        System.out.println("O tempo em horas e "+conversor.getHoras());


        tec.close();
    }
    
}
