import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase:");
        String entrada = tec.nextLine();

        System.out.println("Total de caracteres: " + entrada.length());
        System.out.println("Maiusculo: " + entrada.toUpperCase());
        System.out.println("Minusculo: " + entrada.toLowerCase());
        System.out.println("Quantidade de letras a: " + contarA(entrada, 0));

        tec.close();
    }

    public static int contarA(String s, int index) {
        if (index >= s.length()) {
            return 0;
        }
        
        int count = (s.toUpperCase().charAt(index) == 'A') ? 1 : 0;
        
        return count + contarA(s, index + 1);
    }
}