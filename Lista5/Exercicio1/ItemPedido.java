package Lista5POO.Exercicio1;

public class ItemPedido{
    private Produto produto;
    private int qtd;

    public ItemPedido(Produto produto, int qtd){
        this.produto = produto;
        this.qtd = qtd;
    }

    public Produto getProduto(){
        return produto;
    }

    public int getQtd(){
        return qtd;
    }

    public double calcSubtotal(){
        return qtd * produto.getPreco();
    }

    public void aumentarQtd(int qtd){
        this.qtd += qtd;
    }

    public void imprimirItem(){
        System.out.println(produto.getNome() + ":");
        System.out.println("\tQuantidade:" + qtd);
        System.out.printf("\tSubtotal: %.2f", calcSubtotal());
        System.out.println("\tQuantidade em estoque:" + produto.getQtdEstoque());
    }
}