

public class OperacaoMatematica {
    private float resultado;

    public OperacaoMatematica(){
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
    public void div(float n) throws ArithmeticException{
        if(n == 0){
            throw new ArithmeticException("Erro divisao por 0");
        }else{resultado/=n;}
        
    }
    public void limpar(){
        resultado = 0;
    }
    public double getResultado(){
        return resultado;
    }
    public void raiz() throws ArithmeticException{
        if(resultado<0){
            throw new ArithmeticException("Erro nao tem raiz de numero negativo!");
        }
        else{
            resultado = (float) Math.sqrt(resultado);
        }

    }
    public void executar(char op, float n){
        if(op == '+'){
            soma(n);
        }
        else if(op == '-'){
            sub(n);
        }else if(op == '*'){
            multi(n);
        }else if(op == '/'){
            div(n);
        }else if (op == 'r') {
            raiz();
            
        }
        else{
            System.out.println("Ta doidao meno?");
        }

    }
}
