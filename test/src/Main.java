import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        while (true) {
            System.out.println("Deseja cadastrar uma nova pessoa? (s/n)");
            String opcao = input.nextLine();

            if (opcao.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println("Nome:");
            String nome = input.nextLine();

            System.out.println("Idade:");
            int idade = input.nextInt();
            input.nextLine();

            System.out.println("sexo:");
            String sexo = input.nextLine();

            pessoa.adicionarPessoas(nome, idade , sexo);

        }
        System.out.println("\n===== LISTA DE PESSOAS CADASTRADAS =====");
        System.out.println("Tamanho da lista: " + pessoa.quantidadePessoas());
        pessoa.mostrarPessoas();
    }
}
