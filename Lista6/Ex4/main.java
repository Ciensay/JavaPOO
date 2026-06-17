package Ex4;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite um valor x, y e raio");
        int x = tec.nextInt();
        int y = tec.nextInt();
        int raio = tec.nextInt();
        Circulo c = new Circulo(x, y, raio);
        c.desenhar();
        c.redimencionar(10);
        c.desenhar();
        c.dividir();
        c.desenhar();



        tec.close();
    }
}
