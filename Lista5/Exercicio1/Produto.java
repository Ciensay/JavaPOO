package Lista5POO.Exercicio1;

public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public Produto(String nome, double preco, int qtdEstoque){
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.nome = nome;
    }

    public String getNome(){ return nome; }

    public double getPreco(){ return preco; }

    public int getQtdEstoque(){ return qtdEstoque; }

    public boolean retirarEstoque(int qtd){
        if(this.qtdEstoque > qtd && qtd <= this.qtdEstoque){
            this.qtdEstoque -= qtd;
            return true;
        }
        return false;
    }
}
