package lista1.atividade3;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Objeto> objetos;

    public Estoque() {
        this.objetos = new ArrayList<>();
    }

    public void adicionarObjeto(Objeto objeto) {
        objetos.add(objeto);
    }

    public void removerObjeto(int id) {
        Objeto objetosRemover = buscarObjetoPorId(id);
        if (objetosRemover != null) {
            objetos.remove(objetosRemover);
        }
    }

    public void atualizarQuantidade(int id, int novaQuantidade) {
        Objeto objeto = buscarObjetoPorId(id);
        if (objeto != null) {
            objeto.setQuantidade(novaQuantidade);
        }
    }

    public List<Objeto> listarObjetos() {
        return objetos;
    }

    public Objeto buscarObjetoPorId(int id) {
        for (Objeto objeto : objetos) {
            if (objeto.getId() == id) {
                return objeto;
            }
        }
        return null;
    }
}