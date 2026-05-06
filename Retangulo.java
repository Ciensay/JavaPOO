public class Retangulo{
    //Editor grafico
    private int x;
    private int y;
    private int largura;
    private int altura;

    public Retangulo(int x, int y, int lar, int alt){
        this.x = x;
        this.y = y;
        this.largura = lar;
        this.altura = alt;

    }
    public Retangulo(Retangulo outro){
        this.x = outro.x;
        this.y = outro.y;
        this.largura = outro.largura;
        this.altura = outro.altura;

    }
    private void mover(int novoX, int novoY){
        x = novoX;
        y = novoY;


    }
    public void redimensionar(float sx, float sy){
        if(sx<0 || sy<0)return;
        largura = (int)(sx *largura);
        altura = (int)(sy *altura);


    }
    private void dividir(int n){
        altura = altura/n;
        largura = largura/n;


    }
    public void desenhar(){
        System.out.printf("Retangulo (%d, %d, %d, %d)\n", x,y,altura,largura);

    }
    public static void main(String[] args){
        Retangulo r1 = new Retangulo(3, 4, 12,6);
        r1.desenhar();
        r1.mover(30,40);
        r1.desenhar();
        r1.redimensionar(100f,100f);
        r1.desenhar();
        r1.dividir(2);
        r1.desenhar();



    }


}