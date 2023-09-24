package C_For_EX03;

public class Intervalo {
    private int n1, n2;
    private String imprimir="";
    
    public String calcularIntervalo (int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
        
        for (int cont = this.n1; cont <= this.n2; cont++){
            this.imprimir = this.imprimir + "\n" + cont;
        }
        return this.imprimir;
    }
}
