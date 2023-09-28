package lista2.atividade5;


public abstract class Nobre {

    //atributos
    public String nome;
    private Casa casa;

    public Nobre(String nome, Casa casa) {
        this.nome = nome;
        this.casa = casa;
    }

    //métodos
    public abstract void fazerJuramento();

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
}
