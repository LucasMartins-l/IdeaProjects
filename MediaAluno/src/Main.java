import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Notas notas = new Notas();

        System.out.println("Digite o nome:");
        String nome = input.nextLine();

        notas.setNome(nome) ;

        System.out.println("Digite a nota:");
        double nota = input.nextDouble();

        notas.setNota(nota);


        System.out.printf("nome: %s%n nota: %.25567f%n Letra: %s%n" ,notas.getNome()
                , notas.getNota() , notas.getLetra());


    }
}