package lista10.ex1;

public class CalculadoraPrimo extends Thread{
    private int inicio;
    private int fim;
    private int qtd_primos = 0;
    public CalculadoraPrimo(int inicio, int fim){
        this.inicio = inicio;
        this.fim = fim;
    }
    private Boolean ehPrimo(int n){
        if(n<=1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    @Override
    public void run(){
        for(int i = inicio; i<= fim; i++){
            if(ehPrimo(i)){

                qtd_primos++;


            }

        }

    }
    public int getQtdPrimo(){
        return qtd_primos;
    }
}
