import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Banco banco = new Banco();


        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = input.nextLine();

            System.out.print("Digite o saldo inicial de " + nome + ": ");
            double saldo = input.nextDouble();
            System.out.println("===-===-===-===-===-===-===-===-===");

            input.nextLine();
            banco.adicionarPessoa(new Pessoa(nome, saldo));
        }

        while (true) {
            System.out.println("\n-------------Banco Caixa -----------\n");
            System.out.println("Opções:");
            System.out.println("(1) Depositar");
            System.out.println("(2) Sacar");
            System.out.println("(3) Mostrar saldo");
            System.out.println("(4) Mostrar extrato");
            System.out.println("(5) Fazer PIX");
            System.out.println("(S) Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = input.nextLine();

            if (opcao.equalsIgnoreCase("S")) {
                System.out.println("Saindo do sistema...");
                break;
            }

            switch (opcao) {
                case "1":
                    System.out.print("Nome da pessoa: ");
                    String nomeDeposito = input.nextLine();
                    Pessoa pDeposito = banco.buscarPessoa(nomeDeposito);
                    if (pDeposito != null) {
                        System.out.print("Valor do depósito: ");
                        double valorDep = input.nextDouble();
                        input.nextLine();
                        pDeposito.depositar(valorDep);
                    } else {
                        System.out.println("Pessoa não encontrada!");
                    }
                    break;

                case "2":
                    System.out.print("Nome da pessoa: ");
                    String nomeSaque = input.nextLine();
                    Pessoa pSaque = banco.buscarPessoa(nomeSaque);
                    if (pSaque != null) {
                        System.out.print("Valor do saque: ");
                        double valorSaque = input.nextDouble();
                        input.nextLine();
                        pSaque.sacar(valorSaque);
                    } else {
                        System.out.println("Pessoa não encontrada!");
                    }
                    break;

                case "3":
                    System.out.print("Nome da pessoa: ");
                    String nomeSaldo = input.nextLine();
                    Pessoa pSaldo = banco.buscarPessoa(nomeSaldo);
                    if (pSaldo != null) {
                        System.out.printf("%s: %.2f%n", pSaldo.getNome(), pSaldo.getSaldo());
                    } else {
                        System.out.println("Pessoa não encontrada!");
                    }
                    break;

                case "4":
                    System.out.print("Nome da pessoa: ");
                    String nomeExtrato = input.nextLine();
                    Pessoa pExtrato = banco.buscarPessoa(nomeExtrato);
                    if (pExtrato != null) {
                        pExtrato.mostrarExtratos();
                    } else {
                        System.out.println("Pessoa não encontrada!");
                    }
                    break;

                case "5":
                    System.out.print("Remetente: ");
                    String remetente = input.nextLine();
                    System.out.print("Destinatário: ");
                    String destinatario = input.nextLine();
                    System.out.print("Valor do PIX: ");
                    double valorPix = input.nextDouble();
                    input.nextLine();
                    banco.pix(remetente, destinatario, valorPix);
                    break;

                default:
                    System.out.println("Opção inválida ❌");
                    break;
            }
        }

        input.close();
    }
}
