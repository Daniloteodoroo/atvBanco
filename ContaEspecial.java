public class ContaEspecial extends ContaBancaria{
    
    public ContaEspecial(String n, Integer num) {
        super(n, num);
    }

    double saldoNegativo;

    public void setSaldoNegativo (double saldoNegativo){
        this.saldoNegativo = saldoNegativo;
    }

    public double getSaldoNegativo(){
        return saldoNegativo;
    }
}
