package F_Encapsulamento_Ex11;

import javax.swing.JOptionPane;

public class SalVIEW {
 
    public static void main(String[] args){
        try{
            
                SalCTR salCTR = new SalCTR();
                SalDTO salDTO = new SalDTO();
                
                double cod = Double.parseDouble(JOptionPane.showInputDialog("Deseja inserir dados de outro habitante?"
                        + "\n 1(SIM) | 0(NÃO):"));
                
                while(cod!= 0){
                    
                    salDTO.setSal(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário:")));
                    String genero  = JOptionPane.showInputDialog("Informe o gênero do habitante:");
            
                if((genero.equalsIgnoreCase("F")) || (genero.equalsIgnoreCase("M"))){
            
                    salDTO.setGenero(genero);
                    salCTR.calcular(salDTO);
                }
                cod = Double.parseDouble(JOptionPane.showInputDialog("Deseja inserir dados de outro habitante?"
                        + "\n 1(SIM) | 0(NÃO):"));
            }
                
                JOptionPane.showMessageDialog(null, salCTR.imprimir());
         }
        catch(Exception e){
         JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
