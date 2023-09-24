package F_Encapsulamento_Ex09;

public class AlturaDAO {
    public String classi(AlturaDTO alturaDTO){
        if((alturaDTO.getAlt() < 1.20) && (alturaDTO.getPeso() < 60)){
            return "A classificação é A";
        }
        else{
            if((alturaDTO.getAlt() > 1.20) && (alturaDTO.getPeso() >= 60) && (alturaDTO.getPeso() <= 90)){
                return "A classificação é D";
        }   
            else{
                if((alturaDTO.getAlt() < 1.20) && (alturaDTO.getPeso() > 90)){
                return "A classificação é G";
            }
                else{
                    if((alturaDTO.getAlt() >= 1.20) && (alturaDTO.getAlt() <= 1.70) && (alturaDTO.getPeso() < 60)){
                        return "A classificação é B";
                }
                    else{
                        if((alturaDTO.getAlt() >= 1.20) && (alturaDTO.getAlt() <= 1.70) && (alturaDTO.getPeso() >= 60) && (alturaDTO.getPeso() <= 90)){
                            return "A classificação é E";
                        }
                        else{
                            if((alturaDTO.getAlt() >= 1.20) && (alturaDTO.getAlt() <= 1.70) && (alturaDTO.getPeso() > 90)){
                                return "A classificação é H";
                            }
                            else{
                                if((alturaDTO.getAlt() > 1.70) && (alturaDTO.getPeso() < 60)){
                                    return "A classificação é C";
                                }
                                else{
                                    if((alturaDTO.getAlt() > 1.70) && (alturaDTO.getPeso() >= 60) && (alturaDTO.getPeso() <= 90)){
                                        return "A classificação é F";
                                    }
                                    else{
                                        return "A classificação é I";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
}
}
