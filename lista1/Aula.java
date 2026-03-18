import java.util.Scanner;

public class Aula{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero:");
        int numero = teclado.nextInt();
        System.out.print("Digite um nome:");
        teclado.nextLine(); 
        String nome = teclado.nextLine();





        System.out.println("O seu numero e " + numero+" e o seu nome e "+nome);
        teclado.close();
    }



}