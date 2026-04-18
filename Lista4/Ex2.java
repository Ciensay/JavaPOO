import java.util.Scanner;

public class Ex2 {
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
        boolean achou = false;
        for(int i = 0; i<n; i++){
            if(v[i] == k){
                achou = true;
                System.out.println("numero no indice: " +i);

        }
    }
        if(!achou) System.out.println("Numero nao encotrado");
        tec.close();
    }


    
    
    }
