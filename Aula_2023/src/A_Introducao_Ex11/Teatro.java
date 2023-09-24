/*
Faça um programa que receba o custo de um espetáculo teatral e o preço do 
convite desse espetáculo. Esse programa deve calcular e mostrar a quantidade
de convites que devem ser vendidos para que pelo menos o custo do espetáculo
seja alcançado
 */

package A_Introducao_Ex11;

public class Teatro {
    private double preco_con, quantidade_con, custo_esp;
    
    public String calcularTeatro (double custo_esp, double preco_con){
    
        this.custo_esp = custo_esp;
        this.preco_con = preco_con;
        
        this.quantidade_con = this.custo_esp / this.preco_con;
        
        return "Devem ser vendidos pelo menos " + this.quantidade_con + " convites";
    }
}
