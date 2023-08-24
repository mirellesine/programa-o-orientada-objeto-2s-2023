package revisao;

public class Pessoa {
    public String palavraCumprimento;

    public Pessoa(String palavra) {
        this.palavraCumprimento = palavra;
    }

    private void cumprimentar() {
        System.out.println(this.palavraCumprimento);
    }
}
