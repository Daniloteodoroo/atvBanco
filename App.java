import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome;
        Integer numero, exibir;
        double valor;

        int opcao = 0, escolha;

        do {

            opcao();
            opcao = in.nextInt();

            switch (opcao) {
                case 1:

                    Contas();
                    escolha = in.nextInt();

                    if (escolha == 1) {
                        System.out.print("Nome do cliente: ");
                        nome = in.next();
                        System.out.print("Número da conta: ");
                        numero = in.nextInt();

                        ContaBancaria cb = new ContaBancaria(nome, numero);

                        System.out.print("Valor a ser depositado: ");
                        valor = in.nextDouble();

                        cb.setDepositar(valor);
                    } else if (escolha == 2) {
                        System.out.print("Nome do cliente: ");
                        nome = in.next();
                        System.out.print("Número da conta: ");
                        numero = in.nextInt();

                        ContaPoupanca cp = new ContaPoupanca(nome, numero);

                        System.out.print("Valor a ser depositado: ");
                        valor = in.nextDouble();

                        cp.setDepositar(valor);
                    } else {
                        System.out.print("Nome do cliente: ");
                        nome = in.next();
                        System.out.print("Número da conta: ");
                        numero = in.nextInt();

                        ContaEspecial ce = new ContaEspecial(nome, numero);

                        System.out.print("Valor a ser depositado: ");
                        valor = in.nextDouble();

                        ce.setDepositar(valor);
                    }
                    break;

                case 2:
                    Contas();
                    escolha = in.nextInt();

                    if (escolha == 1) {
                        System.out.print("Nome do cliente: ");
                        nome = in.next();
                        System.out.print("Número da conta: ");
                        numero = in.nextInt();

                        ContaBancaria cb = new ContaBancaria(nome, numero);

                        System.out.print("Valor a ser sacado: ");
                        valor = in.nextDouble();

                        cb.setSacar(valor);
                    } else if (escolha == 2) {
                        System.out.print("Nome do cliente: ");
                        nome = in.next();
                        System.out.print("Número da conta: ");
                        numero = in.nextInt();

                        ContaPoupanca cp = new ContaPoupanca(nome, numero);

                        System.out.print("Valor a ser sacado: ");
                        valor = in.nextDouble();

                        cp.setSacar(valor);
                    } else {
                        System.out.print("Nome do cliente: ");
                        nome = in.next();
                        System.out.print("Número da conta: ");
                        numero = in.nextInt();

                        ContaEspecial ce = new ContaEspecial(nome, numero);

                        System.out.print("Valor a ser sacado: ");
                        valor = in.nextDouble();

                        ce.setSacar(valor);
                    }
                    break;

                case 3:
                    Contas();
                    escolha = in.nextInt();

                    if (escolha == 1) {
                        System.out.print("Nome do cliente: ");
                        nome = in.next();
                        System.out.print("Número da conta: ");
                        numero = in.nextInt();

                        ContaBancaria cb = new ContaBancaria(nome, numero);

                        exibir = cb.exibir(numero);

                        if (exibir == -1){
                            System.out.println("Conta não encontrada.");
                        } else {
                            System.out.println(exibir);
                        }
                        
                    } else if (escolha == 2) {
                        System.out.print("Nome do cliente: ");
                        nome = in.next();
                        System.out.print("Número da conta: ");
                        numero = in.nextInt();

                        ContaBancaria cp = new ContaBancaria(nome, numero);

                        exibir = cp.exibir(numero);

                        if (exibir == -1){
                            System.out.println("Conta não encontrada.");
                        } else {
                            System.out.println(exibir);
                        }
                        
                    } else {
                        System.out.print("Nome do cliente: ");
                        nome = in.next();
                        System.out.print("Número da conta: ");
                        numero = in.nextInt();

                        ContaBancaria ce = new ContaBancaria(nome, numero);

                        exibir = ce.exibir(numero);

                        if (exibir == -1){
                            System.out.println("Conta não encontrada.");
                        } else {
                            System.out.println(exibir);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Bye, Bye!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public static void opcao() {
        System.out.println("1 - Depositar");
        System.out.println("2 - sacar");
        System.out.println("3 - exibir");
        System.out.println("0 - Encerrar");
        System.out.println();
        System.out.print("Informe a opção desejada: ");
    }

    public static void Contas() {
        System.out.println("Opção (1): Conta Bancaria");
        System.out.println("Opção (2): Conta Poupança");
        System.out.println("Opção (3): Conta Especial");
        System.out.println();
        System.out.print("Informe a pção desejada: ");
    }
}
