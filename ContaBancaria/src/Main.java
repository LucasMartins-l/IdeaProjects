import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Contas contas = new Contas();

        System.out.printf("Nome:");
        String nome = input.nextLine();

        contas.setNome(nome);

        System.out.printf("Seja bem vindo %s\uD83E\uDD73\uD83E\uDD73\uD83E\uDD73..%n", contas.getNome());
    }
}