package Ex4;

public class Circulo {
    private int x;
    private int y;
    private int raio;
    
    public Circulo(int x, int y, int r){
        raio = r;
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
        
    }
    public void setRaio(int r){
        this.raio = r;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getRaio(){
        return raio;
    }
    public void desenhar(){
        System.out.printf("Circulo(x: %d, y: %d, raio: %d)\n", x, y, raio);
    }
    
    public void mover(int x, int y){
        System.out.println("Digite o X");
        setX(x);
        System.out.println("Digite o Y");
        setY(y);
        

    }
    
    public void redimencionar(int r){
        if(r > 0)
            setRaio(r);
    }

    public void dividir(){
        setRaio(raio/2);
    }
}
