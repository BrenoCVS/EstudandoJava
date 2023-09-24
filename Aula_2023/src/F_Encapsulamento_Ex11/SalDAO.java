package F_Encapsulamento_Ex11;

public class SalDAO {
    private double tsal, porcentfem, porcentmasc, porcentfemsal;
    private int pessoas, masc, fem, femSal;
     public void calcular(SalDTO salDTO){
         
         this.tsal += salDTO.getSal();
         this.pessoas++;
         
         if(salDTO.getGenero().equalsIgnoreCase("F")){
     
             this.fem++;
             if(salDTO.getSal() <= 300){
             
                 this.femSal++;
             }
         }
         else{
         
             this.masc++;
         }
         
         System.out.println("Mulheres" + this.fem + " Homens " + this.masc);
     
     }
     
     public String imprimir(){
         
     
         this.porcentfem = (this.fem * 100) / this.pessoas;
         this.porcentmasc = 100 - this.porcentfem;
         this.porcentfemsal = (this.femSal * 100) / this.fem;
         return "o salário ,édio das pessoas é " +this.tsal / this.pessoas + ""
                 + "\n A porcentagem de mulheres ouvidas é " + this.porcentfem +"%"
                 + "\n A porcentagem de homens ouvidos é " + this.porcentmasc +"%"
                 + "\n E a porcentagem de mulheres que tem salário igual ou menor que R$300,00 é " + this.porcentfemsal +"%";
     } 
}
