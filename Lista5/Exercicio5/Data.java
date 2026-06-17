public class Data {
    private int dia, mes, ano;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public boolean dataValida(){
        if(ano<0) return false;
        if(mes>12 || mes<1) return false;
        if(dia>31 || dia<1){
            return false;
        }
        if(dia == 31 &&(mes == 2||mes == 4||mes == 6||mes == 9 || mes == 11)) return false;
        if(!anoBissexto() && mes == 2 && dia>28) return false;
        if(anoBissexto() && mes == 2 && dia>29) return false;
        return true;
        
    }
 
    public boolean anoBissexto(){
        if(ano % 4 != 0){
            return false;
        }
        return true;
    }

    public void imprime(){
        imprime("/");
    }

    public void imprime(String separador){
        if(dataValida())
            System.out.println(dia + separador + mes + separador + ano);
        else
            System.out.println("Data invalida");
    }
}
