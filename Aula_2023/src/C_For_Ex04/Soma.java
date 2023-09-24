package C_For_Ex04;

public class Soma {
    private int n1, n2, soma;
    
    public void calcularSoma (int n1){
        this.n1 = n1;
        this.soma = this.soma + this.n1;
    }
    public int mostrarSoma(){
        return this.soma;
    }
}
