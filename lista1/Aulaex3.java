import java.util.Scanner;

public class Aulaex3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = teclado.nextInt();
        if (numero %2 == 0){
            System.out.printf("O numero %d é par ", numero);

        }else{
        System.out.printf("O numero %d é impar ", numero);
        }
        teclado.close();
    }
}

