/*
03. Faça um algoritmo que receba a altura e o peso de uma pessoa.
De acordo com a tabela a seguir verifique e mostre qual a classificação dessa pessoa.
Altura Peso
Até 60 Entre 60 e 90(inclusive) Acima de 90
Menores de 1,20 A D G
de 1,20 a 1,70 B E H
Maiores que 1,70 C F I
 */
package F_Encapsulamento_Ex09;

import javax.swing.JOptionPane;

public class AlturaVIEW {
    public static void main(String[] args){
    
        try{
        
            AlturaDTO alturaDTO = new AlturaDTO();
            AlturaCTR alturaCTR = new AlturaCTR();
            
            alturaDTO.setAlt(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: ")));
            alturaDTO.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o peso: ")));
        
            JOptionPane.showMessageDialog(null, alturaCTR.imprimir(alturaDTO));

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
