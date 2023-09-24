/*
 um funcionário recebe o salário fixo mais de 4% de comissão sobre as vendas.
faça um programa que receba o salário fixo dxe um funcionário e o valor de suas
vendas, calcule e mostre a comissão e o salário final do funcionário. 
 */
package A_Introducao_Ex04;

public class Fixo {
    private double salario, sal_final, comissao, vendas;
    
    public String calcularFixo (double salario, double vendas){
    this.salario = salario;
    this.vendas = vendas;
    
    this.comissao = this.vendas * 4 / 100;
    this.sal_final = this.salario + this.comissao;
     
    return "O valor da comissão é: " + this.comissao +
           "  O salário final do funcionário é: " + this.sal_final;
    
    }
}
