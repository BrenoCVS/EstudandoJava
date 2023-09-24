/*
faça um programa que receba o número de horas trabalhadas e o valor do salario
minimo.
calcule e mostre o salario a receber seguindo as regras abaixo:
a) a hora trabalhada vale a metade do salario minimo;
b) o salario minimo bruto equivale ao numero de horas trabalhadas multiplicado
pelo valor da hora trabalhada;
c) o imposto equivale a 3% do salario bruto;
d)o salario a receber equivale ao salario bruto menos o imposto;
*/

package A_Introducao_Ex08;

public class Horas {
    private double imposto, hora, sal_min, sal_final, sal_bruto, horas_totais;
    
    public String calcularHoras ( double horas_totais, double sal_min){
    
        this.imposto = imposto;
        this.sal_min = sal_min;
        this.sal_final = sal_final;
        this.hora = hora;
        this.horas_totais = horas_totais;
        
        
       this.hora = (this.sal_min / 2);
       this.sal_bruto = (this.hora * this.horas_totais);
       this.imposto = (this.sal_bruto * 3/100);
       this.sal_final = (this.sal_bruto - this.imposto);
       
       return "\nA hora trabalhada vale: " + this.hora +
               "\nO salário bruto vale: " + this.sal_bruto +
               "\nO imposto vele: " + this.imposto +
               "\nO salário final vale: " + this.sal_final;
       
    }
    
}
