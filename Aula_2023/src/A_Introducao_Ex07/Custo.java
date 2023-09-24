/*
O custo ao consumidor de um novo carro é a soma do preço de fábrica com o 
percentual de lucro do distribuidor e dos impostos ao preço de fábrica.
Faça um programa que receba o preço de fábrica de um veiculo, o percentual
de lucro do distribuidor  e o percentual de impostos.
calcule  e mostre:
a) o valor correspondente ao lucro do distribuidor;
b) o valor correspondente ao imposto;
c) o preço final do veículo.
 */

package A_Introducao_Ex07;

public class Custo {
    private double lucro, imposto, preco_fabrica, preco_final;
    
    public String CalcularCusto (double lucro, double imposto, double preco_fabrica){
    
        this.lucro = lucro;
        this.imposto = imposto;
        this.preco_fabrica = preco_fabrica;
        
        this.imposto = (this.preco_fabrica * this.imposto / 100 );
        this.lucro = (this.preco_fabrica * this.lucro / 100 );
        this.preco_final = (this.preco_fabrica + this.imposto + this.lucro);
        
        return "\nO valor correspondente ao lucro do distribuidor é de: " + this.lucro +
                "\nO valor correspondente ao imposto é de: " + this.imposto + 
                "\nO preço final do veículo ficou: " + this.preco_final;
        
    }
}
