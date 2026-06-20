package Ex3;

import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args){
        Estagiario Ana = new Estagiario("Ana", 800f);
        Vendedor Mari = new Vendedor("Mari", 1300f, 0);
        System.out.println("O Salario de Ana e "+Ana.salarioLiquido());
        System.out.println("O salario liquido de Mari e "+Mari.salarioLiquido());
    } 
    
}
