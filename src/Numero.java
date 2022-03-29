
public class Numero {

    private double valor;
    private String valorOp;
    
    public Numero(){
        this.valor = 0;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double aux){
        this.valor = aux;
    }

    public String getValorOp(){
        return this.valorOp;
    }

    public void setValorOp(String aux){
        this.valorOp = aux;
    }
}