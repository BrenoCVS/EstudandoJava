package F_Encapsulamento_Ex08;

public class OrdemDAO {
    
     public String cres(OrdemDTO ordemDTO){
    
        if((ordemDTO.getN1() > ordemDTO.getN2()) && (ordemDTO.getN1() > ordemDTO.getN3()) && (ordemDTO.getN2() > ordemDTO.getN3())){
        
            return "A ordem crescente é: " + ordemDTO.getN3() + ", " + ordemDTO.getN2() + " e " + ordemDTO.getN1();
        
        }
        else{
            if((ordemDTO.getN1() > ordemDTO.getN2()) && (ordemDTO.getN1() > ordemDTO.getN3()) && (ordemDTO.getN3() > ordemDTO.getN2())){
                
                return "A ordem crescente é: " + ordemDTO.getN2() + ", " + ordemDTO.getN3() + " e " + ordemDTO.getN1();

            }
            else{
                if((ordemDTO.getN2() > ordemDTO.getN1()) && (ordemDTO.getN2() > ordemDTO.getN3()) && (ordemDTO.getN1() > ordemDTO.getN3())){
                
                    return "A ordem crescente é: " + ordemDTO.getN3() + ", " + ordemDTO.getN1() + " e " + ordemDTO.getN2();

                }
                else{
                    if((ordemDTO.getN2() > ordemDTO.getN1()) && (ordemDTO.getN2() > ordemDTO.getN3()) && (ordemDTO.getN3() > ordemDTO.getN1())){
                        return "A ordem crescente é: " + ordemDTO.getN1() + ", " + ordemDTO.getN3() + " e " + ordemDTO.getN2();
                    }
                    else{
                        if((ordemDTO.getN3() > ordemDTO.getN1()) && (ordemDTO.getN3() > ordemDTO.getN2()) && (ordemDTO.getN1() > ordemDTO.getN2())){
                            return "A ordem crescente é: " + ordemDTO.getN2() + ", " + ordemDTO.getN1() + " e " + ordemDTO.getN3();

                        }
                        else{
                            if((ordemDTO.getN3() > ordemDTO.getN1()) && (ordemDTO.getN3() > ordemDTO.getN2()) && (ordemDTO.getN2() > ordemDTO.getN1())){
                                
                                return "A ordem crescente é: " + ordemDTO.getN1() + ", " + ordemDTO.getN2() + " e " + ordemDTO.getN3();
                                
                            }
                            else{
                                return "Os três números são iguais";
                            }
                        }
                    }
                }
            }
        }
    }
}
