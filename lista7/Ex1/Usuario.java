package Ex1;


abstract class Usuario {
    private String nome;
    private String senha;

    // Construtor
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    // Get e set
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}

// CLIENTE (Herda de Usuario)
class Cliente extends Usuario {
    private String dataNascimento; 

    // Construtor repassando nome e senha para a classe "pai" usando 'super'
    public Cliente(String nome, String senha, String dataNascimento) {
        super(nome, senha); 
        this.dataNascimento = dataNascimento;
    }

    public void Comprar() {
        System.out.println(getNome() + " está comprando um produto!");
    }
}

// FUNCIONARIO (Herda de Usuario)
class Funcionario extends Usuario {
    
    public Funcionario(String nome, String senha) {
        super(nome, senha);
    }

    public void Vender() {
        System.out.println(getNome() + " está realizando uma venda!");
    }
}

//  GERENTE (Herda de Funcionario)
class Gerente extends Funcionario {

    public Gerente(String nome, String senha) {
        super(nome, senha);
    }

    public void FecharCaixa() {
        System.out.println(getNome() + " está fechando o caixa!");
    }
}