package F_Encapsulamento_Ex12;

public class PredioDAO {
    private int total, num;
    
    public String calcular(PredioDTO predioDTO){
    
        this.total += predioDTO.getEntra() - predioDTO.getSai();
        
        if(this.total > 15){
            this.num = this.total - 15;
            
            return "O elevador está excedendo o número total de passageiros"
                    + "\n Devem ser retirados " + this.num + " passageiros";
        }
        
        return "ok";
    }
    
    public String imprimir(){
    
       
                return "O elevador está com " + this.total + " passageiros";
            }
           
            
        
}

