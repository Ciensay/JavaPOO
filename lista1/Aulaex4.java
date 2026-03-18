import java.util.Scanner;

public class Aulaex4 {
    public static final int real = 100;
    public static void main(String[] args) {
        int[] moedas = new int[5];
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i<6; i++){
        System.out.print("Digite uma moeda");
        moedas[i] = teclado.nextInt();
        }
        teclado.close();
    }
}
