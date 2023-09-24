/*
Faça um algoritmo que receba a altura e o peso de uma pessoa.
De acordo com a tabela a seguir verifique e mostre qual a classificação dessa
pessoa.

                    |-----------|               PESO            |-------------------|
ALTURA              |  ATÉ 60   |          |ENTRE 60 E 90|      |     ACIMA DE 90   |
--------------------|-----------|----------|-------------|------|-------------------|---
menores de 1,20     |     A     |          |       D     |      |         G         | 
de 1,20 a 1,70      |     B     |          |       E     |      |         H         |
maiores que 1,70    |     C     |          |       F     |      |         I         |
*/
package B_IF_Ex04;

public class Peso {
    private String classi;
    private double altura, peso;
    public String calcularPeso (double altura, double peso){
    
        this.altura = altura;
        this.peso = peso;
        
        if (this.altura < 1.20){
            if (this.peso < 60) {
                this.classi = "A";
            }
            else{
                if ((this.peso <= 90)&&(this.peso >=60)){
                    this.classi = "D";
                }
                else {
                    this.classi = "G";
                }
            }
        }
        
        
        else{
            if ((this.altura >= 1.20)&& (this.altura  <= 1.70)){
                if (this.peso < 60) {
                    this.classi = "B";
                }
                else {
                    if ((this.peso <= 90) &&(this.peso >=60)){
                        this.classi = "E";
                    }
                    else{
                        this.classi = "H";
                    }                
                }
            }
            
            
            else{
                if (this.peso < 60){
                    this.classi = "C";
                }
                else{
                    if ((this.peso <= 90)&& (this.peso >= 60)){
                        this.classi = "F";
                    }
                    else{
                        this.classi = "I";
                    }
                }
            }
   
        }
        
        
     return this.classi;   
    }
}
