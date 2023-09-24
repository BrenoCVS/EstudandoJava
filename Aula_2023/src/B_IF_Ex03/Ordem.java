/*
Faça um algoritmo que receba trÊs números obrigatoriamente em ordem crescente
(do menor para o maior) e um quarto número (número qualquer) que não siga a
regra dos três primeiros. Ao final o algooritmo deve imprimir os quatrs números
em ordem decrescente (do maior para o maior).
Os números devem ser do tipo inteiro.
 */

package B_IF_Ex03;

public class Ordem {
    private double num1, num2, num3, num4;
    public String calcularOrdem (double num1, double num2, double num3, double num4){
       
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        
        if(this.num4 < this.num1) {
            return this.num3 + "  " + this.num2 + "  " + this.num1 + "  " + this.num4;
        }
        else{
            if((this.num4 < this.num1) && (this.num4 < this.num2)){
            return this.num3 + "  " + this.num2 + "  " + this.num4 + "  " + this.num1;
            }
            else{
                if((this.num4 > this.num2) && (this.num4 < this.num3)){
                return this.num3 + "  " + this.num4 + "  " + this.num2 + "  " + this.num1;
                }
                else{
                    return this.num4 + "  " + this.num3 + "  " + this.num2 + "  " + this.num1;
                }
            }
        }
        
    }
}
