/*
Faça um programa que receba o número de lados de um
polígono convexo, calcule e mostre o número de diagonais
desse polígono, onde N é o número de lados do polígono.
Sabe-se que ND = N*(N-3)/2
 */
package A_Introducao_Ex14;


public class Poligono {
    private double n_lados, n_diagonais;
            
    public String calcularPoligono ( double n_lados){
        
        this.n_lados = n_lados;
        
        this.n_diagonais = this.n_lados * (this.n_lados - 3)/2;
        
        
        return "O número de diagonais do polígono é: " + this.n_diagonais;
        
    }
}
