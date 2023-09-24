/*
Pedro comprou um saco de ração com peso em quilos.
Pedro possui dois gatos para os quais fornece a quantidade de
ração em gramas. Faça um programa que recebe o peso do saco de
ração e a quantidade de ração fornecida para cada gato (a quantidade
para cada gato deve ser obtida de forma indivídual).
Calcule e mostre quanto restrá de ração em quilos no saco após cinco  dias.
 */

package A_Introducao_Ex09;

public class Racao {
    private double peso_saco, gato1, gato2, quilos;
    
    public String calcularRacao (double gato1, double gato2, double peso_saco){
   
        this.gato1 = gato1;
        this.gato2 = gato2;
        this.peso_saco = peso_saco;
        this.quilos = quilos;
        
        this.quilos = (this.gato1 + this.gato2) / 1000;
        this.peso_saco = this.peso_saco - (this.quilos * 5);
        
        return "\nApós 5 dias sobrará no saco de ração : " + this.peso_saco;
    }
    
}
