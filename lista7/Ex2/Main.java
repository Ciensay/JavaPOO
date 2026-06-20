package Ex2;

import java.util.Random;

public class Main {
    public static void main(String[] args){
    Animal[] vetAnimals = new Animal[10];
    Random gerador = new Random();
    for (int i = 0; i < vetAnimals.length; i++) {
            int sorteio = gerador.nextInt(3); // Sorteia 0, 1 ou 2

            if (sorteio == 0) {
                vetAnimals[i] = new Homem();
            } else if (sorteio == 1) {
                vetAnimals[i] = new Cao();
            } else {
                vetAnimals[i] = new Gato();
            }
        }
        System.out.println("Animais falando: ");
        for (int i = 0; i < vetAnimals.length; i++) {
            System.out.println("Animal " + (i + 1) + ": " + vetAnimals[i].fala());
        }
    
    
    }
}
