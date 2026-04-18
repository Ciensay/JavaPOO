import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite o valor de n:");
        int n = tec.nextInt();
        System.out.println("Digite o inicio do intervalo:");
        int v1 = tec.nextInt();
        System.out.println("Digite o fim do intervalo:");
        int v2 = tec.nextInt();

        int menor = Math.min(v1, v2);
        int maior = Math.max(v1, v2);

        EstaEntreIntervalo(n, maior, menor);

        tec.close();
    }

    public static void EstaEntreIntervalo(int n, int maior, int menor) {
        if (n > maior) {
            System.out.println("n esta depois do intervalo");
        } else if (n < menor) {
            System.out.println("n esta antes do intervalo");
        } else {
            System.out.println("n esta dentro do intervalo");
        }
    }
}