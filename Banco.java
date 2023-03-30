public class Banco {
    
    String numero;
    double deposito;
    
    public void setnumeroDaConta (String novoNumero){
        this.numero = novoNumero;
    }

    public String getnumeroDaConta (){
        return numero;
    }

    public void setSaque (double novoSaque){
        this.deposito -= novoSaque;
    }

    public double getSaque (){
        return deposito;
    }

    public void setdeposito (double novoDeposito){
        this.deposito += novoDeposito;
    }

    public double getdeposito (){
        return deposito;
    }

    public void exibir (){
        System.out.println("Deseja exibir informações do usuário?");
        System.out.print("Informe 's' - sim / 'n' - não: ");
    }

    public void opcao (){
        System.out.println("ANALISE AS OPÇÕES ABAIXO.");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar"); 
        System.out.println("4 - Exibir"); 
        System.out.println("0 - Finalizar programa");
        System.out.print("Informe a opção escolhida: ");

    }

    public void diasDaSemana (){
        System.out.println("1 - Domingo ");
        System.out.println("2 - Segunda");
        System.out.println("3 - Terça");
        System.out.println("4 - Quarta");
        System.out.println("5 - Quinta");
        System.out.println("6 - Sexta");       
        System.out.println("7 - Sábado");   
       
