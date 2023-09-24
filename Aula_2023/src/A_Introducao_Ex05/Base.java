/*
faça um programa que receba o salario base de u funcionário.
calcule e mostre o salario a receber, sabendo que esse funcionario tem gratificação
de R$ 50,00 e paga imposto de 10% sobre o salario base.
 */
package A_Introducao_Ex05;

public class Base {
    private double desconto, salario, sal_final;
    
    public double calcularBase (double salario){
    this.salario = salario;
    
    this.sal_final= this.salario - (this.salario * 10 / 100) + 50;
    
    return this.sal_final;
    }
    
}
