
package A_Introducao_Ex12;


public class Combustivel {

public double vm, tg, d, lv, kml; 

    public String calcular(double vm, double tg, double kml ){
    
    this.vm = vm;
    this.tg = tg;
    this.kml = kml;
    
    this.d = this.tg * this.vm;
    this.lv = this.kml / this.d;
    
    return "\ninforme o tempo gasto  : " + this.tg + 
            "\ninforme a velocidade media  : " + this.vm +
            "\ninforme a quantidade de litros  : " + this.lv +
            "\ninforme a distancia :" + this.d; 
    
    
    
    
    
    }    

}
