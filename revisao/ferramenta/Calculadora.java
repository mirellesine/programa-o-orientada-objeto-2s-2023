package revisao.ferramenta;

public class Calculadora {

    public int a;
    public int b;
    public String operador;

    //public String getOperador() 
    
    public int operar() {
        int ret = 0;
        switch (this.operador) {
            case "+":
            ret = this.a + this.b;
            break;

            case "-":
            ret = this.a - this.b;
            break;

            case "*":
            ret = this.a * this.b;
            break;

            case "/":
            ret = this.a / this.b;
            break;]
        }
    }
}
