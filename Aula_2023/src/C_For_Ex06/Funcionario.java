/*
Um funcionário de uma empresa recebe aumento salarial anualmente. sabe-se que:
a- esse funcionario foi contratado em 1955, com salário inicial de R$1.000,00;
b- em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
c- a partir de 1997 (inclusive), os aumentos salariais sempre corresponderam
ao dobro do percentual do ano anterior.
Faça um programa que solicite o ano atual e determine o salário atual desse
funcionário.
teste ano 2004 - R$63094,98
 */
package C_For_Ex06;

public class Funcionario {
    private int ano, vezes;
    private double salario, porcentagem;
    
    public String calcularSalario (int ano){
        this.porcentagem = 0.75;
        this.salario = 1000;
        this.ano = ano;
        this.vezes = this.ano - 1995;
        for(int cont = 1; cont <= this.vezes; cont++){
            this.porcentagem = this.porcentagem * 2;
            this.salario += this.salario * this.porcentagem / 100;
        }
        return "O salário em " + this.ano + " é " + this.salario;
    }
}
