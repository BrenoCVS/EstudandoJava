/*
01. Faça um algoritmo que receba três números obrigatoriamente em ordem crescente
(do menor para o maior) e um quarto número (número qualquer) que não siga a regra
dos três primeiros. Ao final o algoritmo deve imprimir os quatro números em ordem
decrescente (do maior para o menor).
Os números devem ser do tipo inteiro
*/

package F_Encapsulamento_Ex07;

import javax.swing.JOptionPane;

public class NumerosVIEW {
     public static void main(String[] args){
     try{
            NumerosCTR numerosCTR = new NumerosCTR();
            NumerosDTO numerosDTO = new NumerosDTO();
            
            numerosDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: ")));
            numerosDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: ")));
            numerosDTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número: ")));
            numerosDTO.setN4(Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto número: ")));
            
            if((numerosDTO.getN1() < numerosDTO.getN2()) && (numerosDTO.getN2() < numerosDTO.getN3()) && (numerosDTO.getN1() < numerosDTO.getN3())){
            JOptionPane.showMessageDialog(null, numerosCTR.imprimir(numerosDTO));
            }
            else{
                JOptionPane.showMessageDialog(null,"Os números não foram enviados na ordem correta");
            }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
    }
     }
}
