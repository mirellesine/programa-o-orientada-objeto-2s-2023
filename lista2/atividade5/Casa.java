package lista2.atividade5;

//classe que representa as casas de game of thrones
public class Casa {

    //atributos
    private String nome;
    private String lema;
    private String territorio;

    public Casa(String nome, String lema, String territorio) {
        this.nome = nome;
        this.lema = lema;
        this.territorio = territorio;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public String getTerritorio() {
        return territorio;
    }

    public void setTerritorio(String territorio) {
        this.territorio = territorio;
    }
}
