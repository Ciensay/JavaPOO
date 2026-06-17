package Lista5POO.Exercicio1;

public class main {
    public static void main(String[] args){
        Produto p1 = new Produto("feijao", 7.90, 80);
        Produto p2 = new Produto("Arroz", 88.0, 100);
        Produto p3 = new Produto("banana", 2.90, 200);
        


        Pedido meuPedido = new Pedido();
        meuPedido.addProduto(p1, 2);
        meuPedido.addProduto(p2, 10);
        meuPedido.addProduto(p3, 50);
        meuPedido.addProduto(p1, 9);



        meuPedido.setFormaPag(FormaDePagamento.CARTAO);

        meuPedido.imprimirPedido();
      
    }
    
}
