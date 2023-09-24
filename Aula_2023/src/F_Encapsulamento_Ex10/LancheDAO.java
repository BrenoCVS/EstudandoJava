package F_Encapsulamento_Ex10;

public class LancheDAO {
    private double total;
    private int hamb, cheese, misto, ameri, queijo;
    
    public void pedido (LancheDTO lancheDTO){
        if((lancheDTO.getCod() == 1)){
            
           
            lancheDTO.setHamb(lancheDTO.getHamb() + 1);
            lancheDTO.setTotal(lancheDTO.getTotal() + 1.50);
            
        }
        else{
            if(lancheDTO.getCod() == 2){
            
                lancheDTO.setCheese(lancheDTO.getCheese() + 1);
                lancheDTO.setTotal(lancheDTO.getTotal() + 1.80);
            }
            else{
                if(lancheDTO.getCod() == 3){
                
                    lancheDTO.setMisto(lancheDTO.getMisto() + 1 );
                    lancheDTO.setTotal(lancheDTO.getTotal() + 1.20);
                }
                else{
                    if(lancheDTO.getCod() == 4){
                    
                        lancheDTO.setAmeri(lancheDTO.getAmeri() + 1);
                        lancheDTO.setTotal(lancheDTO.getTotal() + 2.00);
                    }
                    else{
                        if(lancheDTO.getCod() == 5){
                        
                            lancheDTO.setQueijo(lancheDTO.getQueijo() + 1);
                            lancheDTO.setTotal(lancheDTO.getTotal() + 1.00);
                        }
                    }
                }
            }
        }
    }
    
    public String mostrar(LancheDTO lancheDTO){
        String resposta;
            resposta = "===========================================";
            resposta += "\nProduto     | Quantidade    | Valor     ";
            resposta += "\n===========================================";

            if(lancheDTO.getHamb() >= 1){
                         
            resposta += "\nHamburger            " + lancheDTO.getHamb() + "              R$" + lancheDTO.getHamb() * 1.50;                   
            }
            if(lancheDTO.getCheese() >= 1){
                
            resposta += "\nCheeseburger         " + lancheDTO.getCheese() + "              R$" + lancheDTO.getCheese() * 1.80;
            }
            if(lancheDTO.getMisto() >= 1){
                
            resposta += "\nMisto Quente            " + lancheDTO.getMisto() + "              R$" + lancheDTO.getMisto() * 1.20;
            }
            if(lancheDTO.getAmeri() >= 1){
                
            resposta += "\nAmericano            " + lancheDTO.getAmeri() + "              R$" + lancheDTO.getAmeri() * 2.00;
            }
            if(lancheDTO.getQueijo() >= 1){
                
            resposta += "\nQueijo Prato            " + lancheDTO.getQueijo() + "              R$" + lancheDTO.getQueijo() * 1.00;
            }
                    
                    resposta += "\n Total a pagar: " + lancheDTO.getTotal();
                     
                     return resposta;
        }
}
