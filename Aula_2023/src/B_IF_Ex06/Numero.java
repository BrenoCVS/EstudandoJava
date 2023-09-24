/*
Faça um algoritmo que solicite dois números inteiros e a operação que deseja
realizar. (A-Adição, S-Subtração, D-Divisão, M-Multiplicação).
Deve ser utilizado o comando switch.
 */
package B_IF_Ex06;

public class Numero {
    private int n1, n2;
    private double resultado;
    private String op;
    public double operacao (int n1, int n2, String op){
    
        this.n1 = n1;
        this.n2 = n2;
        this.op = op;
        
        switch (this.op){
            case "A":
                this.resultado = this.n1 + this.n2;
                break;
            case "S":
                this.resultado = this.n1 - this.n2;
                break;
            case "M":
                this.resultado = this.n1 * this.n2;
                break;
            case "D":
                this.resultado = this.n1 / this.n2;
                break;
            default:
                this.resultado = 0;
        }
        return this.resultado;
    }
    
}
