package Exercicio4;

public class ContaCorrente {
    private String dono;
    private double saldo;
    public final double taxa = 1.5;
    
    public ContaCorrente(String dono, double saldo){
        this.dono = dono;
        this.saldo = saldo;
    }

    public String getDono() { return dono; }

    public void depositar(double qtd){
        this.saldo += qtd;
        System.out.println("Foi depositado a quantia de: "+qtd+" na conta corrente de: "+this.dono);
        System.out.println("Saldo atual: "+this.saldo);
    }
    public void sacar(double qtd){
        double total = qtd + taxa;
        if(saldo >= total){
            saldo -= total;
            System.out.println("Foi sacado a quantia de: "+total+" na conta corrente de: "+this.dono);
            System.out.println("Saldo atual: "+saldo);
        }

        else{
            System.out.println("Saldo insuficiente");
        }
    }
    
}
