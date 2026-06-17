package Exercicio3;

public class emprestimo {
    public void emprestimoLivro(livro Livro, pessoa Pessoa){
        if(!Pessoa.getStatus()){
            Pessoa.emprestaLivro(Livro);
            return;
        }
        System.out.println("O individuo: " + Pessoa.getNome()+" ja esta com o livro: "+ Pessoa.getLivro().getNome());
    }
    
    public void devolveLivro(pessoa Pessoa){
        if(Pessoa.getStatus()){
            Pessoa.devolveLivro();
            return;
        }
        System.out.println("O individuo: " +Pessoa.getNome() + " nao tem nenhum livro para devolver");

    }
    
    public void imprimeImprestimo(pessoa Pessoa){
        System.out.println("Emprestimo:");
        if(Pessoa.getStatus())
            System.out.println("\t"+ Pessoa.getNome() + " esta com o livro " + Pessoa.getLivro().getNome());
        else
            System.out.println("\t"+ Pessoa.getNome() + " nao esta com livro");
    }

}
