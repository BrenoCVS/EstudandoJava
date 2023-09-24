/*
Dados 3 valores ladoA, ladoB e ladoC. Estes valores representam ladods de um
triângulo.
Com base nisso verificar:
a) Se podem ser valores dos lados formam um triângulo.
b) Se formar um triângulo, determinar qual:
    equilátero, isósceles ou escaleno.
c) A resposta deve ser devolvida para a classe principal para ser mostrada.
 */

package B_IF_Ex05;

public class Lado {
    private String classi;
    private double ladoA, ladoB, ladoC;
    public String calcularLado (double ladoA, double ladoB, double ladoC){
    
        this.ladoA= ladoA;
        this.ladoB= ladoB;
        this.ladoC= ladoC;
        
        if ((this.ladoA + this.ladoB > this.ladoC)&& (this.ladoB + this.ladoC > this.ladoA)&& (this.ladoA + this.ladoC > this.ladoB)){
            if((this.ladoA == this.ladoB)&&(this.ladoA == this.ladoC)){
                return "O triângulo é equilátero.";
            }
            else{
                if ((this.ladoA == this.ladoB) || (this.ladoA == this.ladoC) || (this.ladoB == this.ladoC)){
                    return "O triângulo é isósceles.";
                }
                else{
                    return "O triângulo é escaleno.";    
                }
            }
        }
        else{
            return "Não foi possível formar um triângulo.";
        }
    }
}
