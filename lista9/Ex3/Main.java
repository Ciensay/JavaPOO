package lista9.Ex3;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        String[] frase = tec.nextLine().split(" ");

        Map<String, Integer> contagem = new HashMap<>();
        for (String palavra: frase){
            contagem.put(palavra, contagem.getOrDefault(palavra, 0)+1);


        }
        for(String palavra: contagem.keySet()){
            System.out.println("Palvra: "+palavra + " N vezes: " + contagem.get(palavra));
        }

        tec.close();
    }

    
}
