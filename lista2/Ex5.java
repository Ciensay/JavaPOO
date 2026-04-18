import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double[] x = new double[3];
        double[] y = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite x e y da coordenada %d: ", i + 1);
            x[i] = tec.nextDouble();
            y[i] = tec.nextDouble();
        }

        double lado1 = Math.sqrt(Math.pow(x[1] - x[0], 2) + Math.pow(y[1] - y[0], 2));
        double lado2 = Math.sqrt(Math.pow(x[2] - x[1], 2) + Math.pow(y[2] - y[1], 2));
        double lado3 = Math.sqrt(Math.pow(x[0] - x[2], 2) + Math.pow(y[0] - y[2], 2));

        long a = Math.round(lado1);
        long b = Math.round(lado2);
        long c = Math.round(lado3);

        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            if (a == b && b == c) {
                System.out.println("Triangulo Equilatero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triangulo Isosceles");
            } else {
                System.out.println("Triangulo Escaleno");
            }
        } else {
            System.out.println("As coordenadas nao formam um triangulo");
        }

        tec.close();
    }
}

//Esse programa aqui esta arredondando numeros. Alguns resultados nao estao tao precisos, principalmente por ser dificil
// tratar um triangulo equilatero no plano bi dimensional.