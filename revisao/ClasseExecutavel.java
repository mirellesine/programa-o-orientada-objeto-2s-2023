package revisao;

import revisao.ferramenta.Calculadora;

/**
 * ClasseExecutavel
 */

 //static faz com que eu não precise de uma instância para executar o método de uma classe

public class ClasseExecutavel {
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        //Calculadora calc2 = new Calculadora();

        calc.a = 3;
        calc.b = 5;
        calc.operador = "+";

        System.out.println(calc.operar());
    }
}