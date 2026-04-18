import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String[] nomes = new String[10];
        int[] idades = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um nome: ");
            nomes[i] = tec.nextLine();
            System.out.println("Digite uma idade: ");
            idades[i] = tec.nextInt();
            tec.nextLine();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (nomes[j].compareToIgnoreCase(nomes[j + 1]) > 0) {
                    String tempN = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempN;

                    int tempI = idades[j];
                    idades[j] = idades[j + 1];
                    idades[j + 1] = tempI;
                }
            }
        }

        System.out.println("\nOrdem alfabetica:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s (%d) ", nomes[i], idades[i]);
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (idades[j] > idades[j + 1]) {
                    int tempI = idades[j];
                    idades[j] = idades[j + 1];
                    idades[j + 1] = tempI;

                    String tempN = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempN;
                }
            }
        }

        System.out.println("\nOrdem de idade:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s (%d) ", nomes[i], idades[i]);
        }

        tec.close();
    }
}