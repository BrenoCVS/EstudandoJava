/*

 */
package C_For_Ex05;

public class Altura_20 {
    double altura, soma, media;
    int qtd;
    
    public void recebe_dados(double altura){
        this.altura = altura;
        
        this.soma += this.altura;
        
        if(this.altura > 2){
            this.qtd += 1;
        }
        
    }
    
    public double mostra_media(){
        this.media = this.soma / 20;
        return this.media;
    }
    
    public int mostra_qtd(){
        return this.qtd;
    }
    
    
}
