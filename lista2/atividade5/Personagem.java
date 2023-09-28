package lista2.atividade5;

import java.util.ArrayList;
import java.util.List;

//personagem herda de Nobre
public class Personagem extends Nobre {

    //atributos
    private String titulo;
    private List<Dragao> dragoes = new ArrayList<>();

    public Personagem(String nome, Casa casa, String titulo) {
        super(nome, casa);
        this.titulo = titulo;
    }

    //métodos
    public void fazerJuramento() {
        System.out.println(getNome() + " faz o juramento de lealdade à Casa " + getCasa().getNome());
    }

    public void adicionarDragao(Dragao dragao) {
        dragoes.add(dragao);
    }

    public List<Dragao> listarDragoes() {
        return dragoes;
    }

    //getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
