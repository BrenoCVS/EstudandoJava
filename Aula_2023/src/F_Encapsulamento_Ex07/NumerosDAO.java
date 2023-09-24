package F_Encapsulamento_Ex07;

public class NumerosDAO {
    
    public String desc(NumerosDTO numerosDTO){
    
        if(numerosDTO.getN3() < numerosDTO.getN4()){
        
            return "A ordem decrescente é: " + numerosDTO.getN4() + ", " + numerosDTO.getN3() + ", " + numerosDTO.getN2() + " e " + numerosDTO.getN1();
        
        }
        else{
            if((numerosDTO.getN3() > numerosDTO.getN4()) && (numerosDTO.getN2() < numerosDTO.getN4())){
                
                return "A ordem decrescente é: " + numerosDTO.getN3() + ", " + numerosDTO.getN4() + ", " + numerosDTO.getN2() + " e " + numerosDTO.getN1();

            }
            else{
                if((numerosDTO.getN2() > numerosDTO.getN4()) && (numerosDTO.getN1() < numerosDTO.getN4())){
                
                    return "A ordem decrescente é: " + numerosDTO.getN3() + ", " + numerosDTO.getN2() + ", " + numerosDTO.getN4() + " e " + numerosDTO.getN1();

                }
                else{
                    
                        return "A ordem decrescente é: " + numerosDTO.getN3() + ", " + numerosDTO.getN2() + ", " + numerosDTO.getN1() + " e " + numerosDTO.getN4();
                    
                }
            }
        }
    }
    
    
    
}
