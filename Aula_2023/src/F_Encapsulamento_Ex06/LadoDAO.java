package F_Encapsulamento_Ex06;
public class LadoDAO {
    private String classi;
    
    public String calcular(LadoDTO ladoDTO){
        this.classi = classi;
        if (((ladoDTO.getLadoA() + ladoDTO.getLadoB() > ladoDTO.getLadoC()))&& 
                ((ladoDTO.getLadoB() + ladoDTO.getLadoC() > ladoDTO.getLadoA())) && 
                (ladoDTO.getLadoA() + ladoDTO.getLadoC() > ladoDTO.getLadoB())){
            
            return verifica(ladoDTO);
        }
        else{
            return "não é um triângulo";
        }
        
    }
    
    public String verifica(LadoDTO ladoDTO){
        if((ladoDTO.getLadoA() == ladoDTO.getLadoB())&&(ladoDTO.getLadoA() == ladoDTO.getLadoC())){
                return "O triângulo é equilátero.";
            }
            else{
                if ((ladoDTO.getLadoA() == ladoDTO.getLadoB()) || (ladoDTO.getLadoA() == ladoDTO.getLadoC()) || (ladoDTO.getLadoB() == ladoDTO.getLadoC())){
                    return "O triângulo é isósceles.";
                }
                else{
                    return "O triângulo é escaleno.";    
                }
            }
    }
    
    
}
