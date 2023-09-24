
package A_Introducao_Ex11;


public class Espetaculo {
    
    private double custo, precoteatro, quant;
  
    
        public String calcular(double custo, double precoteatro ){

      this.custo = custo;
      this.precoteatro = precoteatro;        
    
      
      this.quant = this.custo / this.precoteatro;
      
      return "a quantidade de convites é : " + this.quant;
      
        }   
}
