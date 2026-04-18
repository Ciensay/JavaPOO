
import java.util.Scanner;

public class ex4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma quantia");
        int valor = scanner.nextInt();

        int[] quantia = new int[6];
        int[] moedas = {100, 50, 25, 10, 5, 1};
        String[] nomes = {"1 real", "50 centavos", "25 centavos", "10 centavos", "5 centavos", "1 centavo"};
    
        for(int i = 0; i < 6; i++){
            if(valor >= moedas[i]){
                quantia[i] = valor / moedas[i];
                valor %= moedas[i];
            }
        }

        for(int i = 0; i < 6; i++){
            if(quantia[i] > 0){
                System.out.println(quantia[i] + " moeda(s) de " + nomes[i]);
            }
        }
        scanner.close();
    }
}
