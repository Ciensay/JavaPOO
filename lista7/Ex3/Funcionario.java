package Ex3;
public abstract class Funcionario {
    private String nome;
    private Float salarioBruto;
    public Funcionario(String nome, Float salario){
        this.nome = nome;
        this.salarioBruto = salario;
    }
    public String getNome(){
        return nome;
    }
    public float getSalarioBruto(){
        return salarioBruto;
    }
    public abstract float salarioLiquido();
}
class Estagiario extends Funcionario{
    public Estagiario(String nome, Float salario){
        super(nome,salario);
    }
    public float salarioLiquido(){
        return super.getSalarioBruto();
    }
}
class Vendedor extends Funcionario{
    private float bonus;
    public Vendedor(String nome, Float salario, float bonus){
        super(nome,salario);
        this.bonus = bonus+1;
    }
    public float salarioLiquido(){
        float desconto;
        float liquido = super.getSalarioBruto() * bonus;
        if(liquido<=900f){
            desconto = 0;
            System.out.println("Salario abaixo de 900RS. Sem nenhum desconto!");
        }
        else if(liquido<=1500f){
            desconto = 0.85f;
            System.out.println("Salario ate 1500RS. Desconto de 15%");
        }
        else if(liquido>1500f){
            desconto = 0.20f;
            System.out.println("Salario acima de 1500RS. Desconto de 20%");
        }
        else{
            desconto = -1;
            System.out.println("Algum erro no salario!");
            
        }
        return liquido * desconto;
        
    }

}
