public class ContaBancaria {
    String nomeDoCliente;
    Integer numeroDaConta;
    double saldo;

    public ContaBancaria (String n, Integer num){
        this.nomeDoCliente = n;
        this.numeroDaConta = num;
        this.saldo = 0;
    }

    public void setDepositar (double saldo){
        this.saldo += saldo;
    }  

    public double getDepositar (){
        return saldo;
    }

    public void setSacar (double saldo){
        this.saldo -= saldo;
    }  

    public double getSacar (){
        return saldo;
    }

    public void setSaldo (double s){
        this.saldo -= saldo;
    }  

    public double getSaldo (){
        return saldo;
    }

    public Integer exibir (Integer num){
        if (numeroDaConta == num){
            System.out.println("Nome: " + nomeDoCliente + ", Número: " + numeroDaConta + ", Saldo: " + saldo);
        } 
        return -1;
    }
}
