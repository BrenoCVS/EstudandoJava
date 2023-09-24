/*
04. O cardápio de uma casa de lanches, especializada em sanduíches, é dado abaixo.
Escreve um algoritmo que leia o código de cada item comprado por um cliente, calcule
e exiba a quantidade e o valor de cada produto consumido e o total a pagar.
código Produto Preço(R$)
1 Hamburger 1.50
2 Cheeseburger 1.80
3 Misto Quente 1.20
4 Americano 2.00
5 Queijo Prato 1.00
O sistema fica solicitando um produto até o 0(zero) ser digitado;
Deve ser desenvolvido um método para calcular os dados da compra e outro para
mostrar a fatura final;
Caso seja digitado um código fora dos apresentados acima deve ser mostrado uma
mensagem de produto inválido.
 */
package F_Encapsulamento_Ex10;

import javax.swing.JOptionPane;

public class LancheVIEW {
    public static void main(String[] args){
     try{
            LancheCTR lancheCTR = new LancheCTR();
            LancheDTO lancheDTO = new LancheDTO();
            lancheDTO.setCod(1);
            while(lancheDTO.getCod() != 0){
            
                lancheDTO.setCod(Integer.parseInt(JOptionPane.showInputDialog("código Produto Preço(R$)"
                        + "\n 1 Hamburger 1.50"
                        + "\n 2 Cheeseburger 1.80"
                        + "\n 3 Misto Quente 1.20"
                        + "\n 4 Americano 2.00"
                        + "\n 5 Queijo Prato 1.00"
                        + "\n 0 - Fecha o pedido"
                        + "\n Insira o código: ")));
                
                if((lancheDTO.getCod() >= 0) && (lancheDTO.getCod() <= 5)){
                lancheCTR.pedido(lancheDTO);
            }
            else{
                JOptionPane.showMessageDialog(null, "Código inválido.");
            }
            }
            
            
                JOptionPane.showMessageDialog(null, lancheCTR.imprimir(lancheDTO));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
    }
     }
}
