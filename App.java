import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Banco cadastrarBanco = new Banco();

        String[] cadastro = new String[100];
        double[] deposito = new double[100];

        char escolha;
        String numeroDeUsuario;
        int quantidade = 0, opcao;

        do {

            cadastrarBanco.opcao();
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < cadastro.length; i++) {
                        System.out.print("Informe o número da conta: ");
                        cadastrarBanco.setnumeroDaConta(in.next());

                        cadastro[quantidade] = cadastrarBanco.getnumeroDaConta();
                        quantidade++;

                        System.out.println("Cadastro [" + quantidade + "] realizado com sucesso.");
                        System.out.print("Deseja realizar um novo cadastro? s/n: ");
                        escolha = in.next().charAt(0);

                        if (escolha != 's') {
                            break;
                        }
                    }
                    break;
                case 2:

                    System.out.println("OPÇÕES DE USUÁRIO...");

                    for (int i = 0; i < quantidade; i++) {

                        System.out.println("Usuário [" + cadastro[i] + "]. ");
                    }

                    System.out.print("Digite a conta que você queira depositar: ");
                    numeroDeUsuario = in.next();

                    for (int i = 0; i < quantidade; i++) {

                        if (numeroDeUsuario.equals(cadastro[i])) {
                            System.out.print("Digite o valor do deposito em R$: ");
                            cadastrarBanco.setdeposito(in.nextDouble());
                            deposito[i] = cadastrarBanco.getdeposito();
                        } else {
                            System.out.println("Usuário não encontrado.");
                        }
                    }

                    System.out.print("Deseja realizar um novo depósito? s/n: ");
                    escolha = in.next().charAt(0);

                    if (escolha != 's') {
                        break;
                    }

                    System.out.println("Usuário não encontrado.");

                    System.out.println();

                    break;

                case 3:

                    System.out.println("OPÇÕES DE USUÁRIO...");

                    for (int i = 0; i < quantidade; i++) {

                        System.out.println("Usuário [" + cadastro[i] + "]. ");
                    }

                    System.out.print("Digite a conta que você queira sacar: ");
                    numeroDeUsuario = in.next();

                    System.out.println("Informe o valor do saque: ");
                    cadastrarBanco.setSaque(in.nextDouble());

                    for (int i = 0; i < quantidade - 1; i++) {
                        System.out.println("O usuário [" + cadastro[i] + "] agora tem R$ " + cadastrarBanco.getSaque());
                    }
                    break;

                case 4:
                    for (int i = 0; i < quantidade; i++) {

                        System.out.println("Usuário [" + cadastro[i] + "]," + " possui R$" + deposito[i]);
                    }
                    break;

                case 0:
                    System.out.println("O PROGRAMA ESTÁ ENCERRADO.");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
