package Exercicio3;
public class livro {
    private String titulo;
    private boolean emprestado;
    
    public livro(String titulo){
        this.titulo = titulo;
        this.emprestado = false;
    }

    public String getNome(){ return titulo; }
}
