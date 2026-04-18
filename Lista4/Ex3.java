import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o numero n");

        int n = tec.nextInt();

        int[] v = new int[n];
        for(int i = 0; i<n; i++) {
            System.out.println("Digite  um numero p o vetor");
            v[i] = tec.nextInt();
        }
        System.out.println("Digite o numero k");

        int k = tec.nextInt();
        System.out.println("Digite o numero p");
        int p = tec.nextInt();
        if(p>=n) System.out.println("posicao invalida");

        
        for(int i = n-1; i>p; i--){
            v[i] = v[i-1];
            
    }
        v[p] = k;
        for (int i =0; i<n; i++){
            System.out.printf("%d, ", v[i]);

        }

        tec.close();
    }


    
    
    }

