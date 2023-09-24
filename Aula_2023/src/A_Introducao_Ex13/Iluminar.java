/*
Sabe-se que para iluminar de maneira correta os cômodos
de uma casa, para cada metro quadrado, deve-se usar 18w
de potência. Faça um programa que receba as duas dimensões
em metros), calcule e mostre a sua área (em metros quadrados)
e a potência de iluminação que deverá ser utilizada.
 */
package A_Introducao_Ex13;

public class Iluminar {
    private double d1, d2, area, potencia;
    
    public String calcularIluminar (double d1, double d2){
    
        this.d1 = d1;
        this.d2 = d2;
        
        this.area = this.d1 * this.d2;
        this.potencia = this.area * 18;
        
        return "A área total é de: " + this.area + "m²" +
                "\nA potência de iluminação é de: " + this.potencia + "W";
    }
}
