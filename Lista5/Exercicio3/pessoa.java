package Exercicio3;

public class pessoa {
    private String nome;
    private boolean estaComLivro;
    private livro Livro;

    public pessoa(String nome){
        this.nome = nome;
        this.estaComLivro = false;
    }

    public void emprestaLivro(livro Livro){
        this.Livro = Livro;
        estaComLivro = true;
    }

    public void devolveLivro(){
        estaComLivro = false;
        Livro = null;
    }

    public String getNome(){ return nome; }

    public boolean getStatus(){ return estaComLivro; }

    public livro getLivro() { return Livro; }
}
