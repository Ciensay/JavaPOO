package Ex4;

public abstract class Conta{
    protected int numero;
    protected float saldo;
    public abstract float consultarSaldo();
    public abstract void depositarSaldo(float n);
    public abstract void sacarSaldo(float n);
    public Conta(int numero, float saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

}
class ContaComum extends Conta{
    public ContaComum(int numero, float saldo){
        super(numero, saldo);
    }
    public float consultarSaldo(){
        System.out.println("Seu saldo atual e " + saldo);
        return this.saldo;
    }
    public void depositarSaldo(float n){
        saldo+=n;
    }
    public void sacarSaldo(float n){
        if(saldo-n<0){
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo-=n;
    }
}
class ContaPoupanca extends Conta{
    private float rentabilidade;
    public ContaPoupanca(int numero, float saldo, float r){
        super(numero, saldo);
        this.rentabilidade =r;
    }
    public float consultarSaldo(){
        System.out.println("Seu saldo atual e " + saldo);
        return this.saldo;
    }
    public void depositarSaldo(float n){
        saldo+=n;
    }
    public void sacarSaldo(float n){
        if(saldo-n<0){
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo-=n;
    }
    public void renderSaldo(){
        saldo = saldo *(1+rentabilidade);
    }
}
class ContaEspecial extends Conta{
    private float limite;
    public ContaEspecial(int numero, float saldo, float l){
        super(numero, saldo);
        limite = l;
    }
    public float consultarSaldo(){
        System.out.println("Seu saldo atual e " + saldo);
        return this.saldo;
    }
    public void depositarSaldo(float n){
        saldo+=n;
    }
    public void sacarSaldo(float n){
        if(saldo-n<-limite){
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo-=n;
    }
}