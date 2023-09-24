/*
faça um programa que receba uma medida em pés.
faça as conversoes a seguir e mostre os resultados.
a)polegadas
b)jardas
c)milhas
sabe-se que:
1 pé = 12 polegadas
1 jarda = 3 pés
1 milha = 1760 jardas
 */
package A_Introducao_Ex06;

public class Conversao {
    private double polegada, jardas, milha, pes;
    
    public String calcularConversao ( double pes){
            
        this.pes = pes;
        
        this.polegada = (this.pes * 12);
        this.jardas = (this.pes / 3);
        this.milha = (this.jardas / 1760);
                
        return "O valor em polegadas é: " + this.polegada +
                "\nO valor em jardas é: " + this.jardas +
                "\nO valor em milhas é: " + this.milha;
    }
}
