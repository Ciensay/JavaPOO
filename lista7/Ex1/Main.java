package Ex1;

public class Main {
    public static void main(String[] args){
        //System.out.println("Teste!");
        Gerente teste = new Gerente("Carlos", "123");
        teste.FecharCaixa();
        
    }
    // A classe usuario pode ser abstract, e tanto o cliente quanto funcionario herdam ela!. O gerente que tem mais funcionalidades que o funcionario herda a classe funcionario
    
}
