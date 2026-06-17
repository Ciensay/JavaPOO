package Ex2;

public class CalcMedia {
    private float notaP1;
    private float notaP2;
    private float notaTrab1;
    private float notaTrab2;
    
    public CalcMedia(float notaP1, float notaP2, float notaTrab1, float notaTrab2){
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaTrab1 = notaTrab1;
        this.notaTrab2 = notaTrab2;
    }

    public float Media(){
        return (notaP1 + notaP2 + notaTrab1 + notaTrab2)/4; 
    }
    
    public void Status(){
        float m = Media();
        System.out.println("A media do aluno e "+m);
        if(m>=6){
            System.out.println("Nota acima de 6: Aprovado");
            
        }else if(m<4){
            System.out.println("Nota abaixo de 4: Reprovado");

        }
        else if(m>4 && m<6){
            System.out.println("Nota entre 4 e 6: Verificacao Suplementar");
        }

    }


}
