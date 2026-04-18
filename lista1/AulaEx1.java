import java.util.Scanner;

public class AulaEx1{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome = teclado.nextLine();





        System.out.println("Ola, "+nome+"! Bem vindo ao Java!");
        teclado.close();
    }


}