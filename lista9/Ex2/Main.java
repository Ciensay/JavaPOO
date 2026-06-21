package lista9.Ex2;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String[] frase = tec.nextLine().split(" "); 
        Set<String> palavrasUnicas = new HashSet<>();


        for (String palavra : frase) {
            palavrasUnicas.add(palavra);
         
        }
        System.out.println(palavrasUnicas.size());


        tec.close();
    }
    
    
}