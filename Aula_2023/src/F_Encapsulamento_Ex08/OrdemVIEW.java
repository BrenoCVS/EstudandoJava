/*
02. Faça um algoritmo que receba três números inteiros e mostre em ordem crescente.
 */
package F_Encapsulamento_Ex08;

import javax.swing.JOptionPane;

public class OrdemVIEW {
    
    public static void main(String[] args){
    
        try{
        
            OrdemDTO ordemDTO = new OrdemDTO();
            OrdemCTR ordemCTR = new OrdemCTR();
            
            ordemDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: ")));
            ordemDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: ")));
            ordemDTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número: ")));
        
            JOptionPane.showMessageDialog(null, ordemCTR.imprimir(ordemDTO));

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
