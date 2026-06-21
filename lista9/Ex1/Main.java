package lista9.Ex1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        String[] frase = sc.nextLine().split(" ");
        //sc.next();
        lista.addAll(Arrays.asList(frase));
        for(int i = lista.size()-1; i>= 0; i--){
            System.out.printf("%s ", lista.get(i));
        }
        
        sc.close();
    }
}


