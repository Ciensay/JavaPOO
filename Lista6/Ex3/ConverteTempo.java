package Ex3;
public class ConverteTempo {
    private int segundos;
    private int minutos;
    private int horas;
    public ConverteTempo(int sec){
        segundos = sec;
        minutos = sec/60;
        horas = minutos/60;
    }
    public int getSegundos(){
        return segundos;
    }
    public int getMinutos(){
        return minutos;
    }
    public int getHoras(){
        return horas;
    }
}
