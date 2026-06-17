package Exercicio3;

public class main {
    public static void main(String[] args){
        livro PE = new livro("Livro Ro7");
        livro SDA = new livro("Senhor dos anoes");
        livro CTS = new livro("Cartas tetas e sixseven");
        pessoa minigoat = new pessoa("Minigot");
        pessoa yago = new pessoa("ogay");
        pessoa kaua = new pessoa("kaua");
        
        emprestimo e = new emprestimo();
        e.emprestimoLivro(PE, kaua);
        e.emprestimoLivro(PE, kaua);
        e.emprestimoLivro(CTS, minigoat);
        e.devolveLivro(minigoat);
        e.devolveLivro(minigoat);
        e.emprestimoLivro(SDA, yago);
        e.imprimeImprestimo(minigoat);
        e.imprimeImprestimo(yago);

    }
}
