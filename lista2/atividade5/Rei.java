package lista2.atividade5;

//rei herda de personagem
public class Rei extends Personagem {
    //atributos
    private int anosDeReinado;

    public Rei(String nome, Casa casa, int anosDeReinado) {
        super(nome, casa, "Rei");
        this.anosDeReinado = anosDeReinado;
    }

    //metodos
    public void governarReino() {
        System.out.println(nome + " governa o reino com sabedoria há " + anosDeReinado + " anos.");
    }

    public int getAnosDeReinado() {
        return anosDeReinado;
    }

    public void setAnosDeReinado(int anosDeReinado) {
        this.anosDeReinado = anosDeReinado;
    }
}