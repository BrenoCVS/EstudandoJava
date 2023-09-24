package F_Encapsulamento_Ex12;

import javax.swing.JOptionPane;

public class PredioVIEW {
    
    public static void main(String[] args){
    
        try{
            PredioCTR predioCTR = new PredioCTR();
            PredioDTO predioDTO = new PredioDTO();
        
            String mensagem;
            
            int andares = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de andares do prédio:"));
            
            int cont = 1; 
            while(cont <= andares){
            
                predioDTO.setEntra(Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas entraram no " + cont + " andar:")));
                predioDTO.setSai(Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas sairam no " + cont + " andar:")));
                mensagem = predioCTR.calcular(predioDTO);
                if(mensagem.equals("ok")){
                
                    cont++;
                }
                else{
                
                    JOptionPane.showMessageDialog(null, mensagem);
                }
            }
            
            JOptionPane.showMessageDialog(null, predioCTR.imprimir());
        
        }
        catch(Exception e){
         JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
    
}
