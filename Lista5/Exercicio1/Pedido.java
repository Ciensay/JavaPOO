package Lista5POO.Exercicio1;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemPedido> itens;
    private FormaDePagamento pagamento;
    
    public Pedido(){ 
        this.itens = new ArrayList<>();
    }
    

    public void addProduto(Produto produto, int quantidade){
        if(produto.retirarEstoque(quantidade)){
            boolean jaTem = false;
            int i;
            for(i = 0; i < itens.size(); i++){
                if(itens.get(i).getProduto().getNome().equals(produto.getNome())){
                    jaTem = true;
                    break;
                }
            }
            
            if(!jaTem){
                ItemPedido novoItem = new ItemPedido(produto, quantidade);
                itens.add(novoItem);
            }
            else{
                itens.get(i).aumentarQtd(quantidade);
            }       
            System.out.println("Produto adicionado: " + quantidade + " e "+ produto.getNome());
     
    }
   
    }
    public void setFormaPag(FormaDePagamento pag){
        this.pagamento = pag;
    }
    public double calcularTotal(){
        double total = 0;
        for(ItemPedido item : itens ){
            total+=item.calcSubtotal();
        }
        return total;
    }
    
    public void imprimirPedido(){
        System.out.println("\n=-=-=-=-=PEDIDO=-=-=-=-=");
        for(ItemPedido item: itens){
            item.imprimirItem();
        }
        System.out.printf("\nTotal a pagar: %.2f\n", calcularTotal());
        System.out.println("Forma de pagamento: "+ pagamento);
        System.out.println("Pedido finalizado");
        if(calcularTotal() > 1000){
            System.out.println("Faz o L!!");
        }

}
    
}
