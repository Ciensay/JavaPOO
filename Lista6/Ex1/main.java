package Ex1;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        Scanner tec = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("Digite 1 soma, 2 para subtracao, 3 para multiplicar, 4 para dividir, 5 para limpar memoria e 6 para sair do programa");
            opcao = tec.nextInt();
            if(opcao == 5){
                calc.limpar();
                System.out.printf("O resultado atual e %.2f\n", calc.getResultado());
                continue;
            }
            System.out.println("Digite um numero");

            float num = tec.nextFloat();
            switch (opcao) {
                case 1:
                    calc.soma(num);
                    System.out.printf("O resultado atual e %.2f\n", calc.getResultado());
                    break;
                case 2:
                    calc.sub(num);
                    System.out.printf("O resultado atual e %.2f\n", calc.getResultado());

                    break;
                case 3:
                    calc.multi(num);
                    System.out.printf("O resultado atual e %.2f\n", calc.getResultado());

                    break;
                case 4:
                    calc.div(num);
                    System.out.printf("O resultado atual e %.2f\n", calc.getResultado());

                    break;
                case 6:
                    return;
                default:
                    break;
            }

        }while(opcao != 6);

        tec.close();
    }

}
