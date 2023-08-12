package lista1.atividade1;

public class verificaNumeroPrimo{
    public static void main(String[] args) {
        int numero = 12; 
        if (verificaPrimo(numero) == 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }

    public static int verificaPrimo(Integer n) {
        if (n <= 1) {
            return 0; 
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; 
            }
        }
        
        return 1; 
    }
}