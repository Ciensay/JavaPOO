package lista2;

import java.util.Scanner;

public class Ex7{
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        int grande = tec.nextInt();
        int pequeno = tec.nextInt();
        int meio = tec.nextInt();
        EstaEntreIntervalo(meio, grande, pequeno);


        tec.close();
    }
    public static boolean EstaEntreIntervalo(int maior, int n, int menor){
        if(n>maior){
            System.out.println("n esta depois do intervalo");
            return false;

        }else if(n<menor)
{
        System.out.println("n esta antes do intervalo");
    return false;

}else{
        System.out.println("esta dentro do intervalo");

    return true;

}

    }
}
