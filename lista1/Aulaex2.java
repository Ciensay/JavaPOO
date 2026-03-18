
import java.util.Scanner;

public class Aulaex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma temperatura em celsius: ");
        float celsius = teclado.nextFloat();
        float Farenheit = (celsius*1.8f)+32;
        System.out.println("Em farenheit fica "+Farenheit);

        teclado.close();
    }
    
}
