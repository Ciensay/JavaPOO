package Ex1;


public class Calculadora {
    private float resultado;

    public Calculadora(){
        this.resultado = 0;
    }
    public void soma(float n){
        resultado += n;

    }
    public void sub(float n){
        resultado -= n;
    }
    public void multi(float n){
        resultado*=n;
        
    }
    public void div(float n){
        if(n == 0){
            System.out.println("Erro divisao por 0");
            return;
        }
        resultado/=n;
    }
    public void limpar(){
        resultado = 0;
    }
    public double getResultado(){
        return resultado;
    }
}
