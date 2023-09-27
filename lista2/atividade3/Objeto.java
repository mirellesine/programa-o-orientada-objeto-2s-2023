package lista2.atividade3;


public class Objeto {
    private String nome;
    private int quantidade;
    private int identificador;

    public Objeto(String nome, int quantidade, int identificador) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getId() {
        return identificador;
    }

    public void setId(int identificador) {
        this.identificador = identificador;
    }
}

