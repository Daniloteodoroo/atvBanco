public class ContaPoupanca extends ContaBancaria {
    
    public ContaPoupanca(String n, Integer num) {
        super(n, num);
    }

    double taxa;

    public void setAtualizar (double taxa){
        this.taxa += taxa;
    }  

    public double getAtualizar (){
        return taxa;
    }
}
