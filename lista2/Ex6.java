import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = tec.nextLine();
        System.out.print("Preco unitario: ");
        double preco = tec.nextDouble();
        System.out.print("Quantidade: ");
        int qtd = tec.nextInt();

        double total = preco * qtd;
        double desconto = 0;

        if (qtd > 50) {
            desconto = 0.25;
        } else if (qtd >= 21) {
            desconto = 0.20;
        } else if (qtd >= 11) {
            desconto = 0.10;
        }

        double valorFinal = total * (1 - desconto);

        System.out.println("\nProduto: " + nome);
        System.out.printf("Valor total a ser pago: R$ %.2f\n", valorFinal);

        tec.close();
    }
}