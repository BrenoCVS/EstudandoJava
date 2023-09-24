/*Sabe-se que o quilowatt de energia custa um quinto do
salário mínimo. Faça um programa que receba o valor do
salário mínimo e a quantidade de quilowatts consumida por uma residência.
Calcule e mostre:
a) o valor, em reais, de cada quilowatts;
b) o valor, em reais, a ser pago por essa residência;
c) o valor, em reais, a ser pago com desconto de 15%
 */
package A_Introducao_Ex10;

public class Quilowatt {
   private double sal_min, quilowatts, pag, valor_quilowatts, pag_desconto;
   
   public String calcularQuilowatt ( double sal_min, double quilowatts){
   
       this.sal_min = sal_min;
       this.quilowatts= quilowatts;
       
       
       this.valor_quilowatts = this.sal_min / 5;
       this.pag = (this.quilowatts * this.valor_quilowatts);
       this.pag_desconto = this.pag - (this.pag * 15/100);
       
       return
       "\nO valor de cada quilowatts em reais é : " + this.valor_quilowatts + 
       "\nO valor em reais a ser pago po essa residência é: " + this.pag + 
       "\nO valor em reais a ser pago com o desconto é: " + this.pag_desconto;
   } 
           
}
