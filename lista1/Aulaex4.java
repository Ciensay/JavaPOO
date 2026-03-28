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




Alterinativa:


import java.util.Scanner;

public class ex4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma quantia");
        int valor = scanner.nextInt();

        int[] quantia = new int[6];
        int[] moedas = {100, 50, 25, 10, 5, 1};
    
        for(int i = 0; i < 6; i++){
            if(valor >= moedas[i]){
                quantia[i] = valor / moedas[i];
                valor %= moedas[i];
            }
        }

        for(int i = 0; i < 6; i++){
            System.out.println(quantia[i]);
        }
    }
}
