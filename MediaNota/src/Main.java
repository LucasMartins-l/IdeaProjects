import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("digite a primeira Nota:");
        double nota1 = input.nextDouble();

        System.out.println("digite a Segunda Nota:");
        double nota2 = input.nextDouble();

        System.out.println("digite a Terceira Nota:");
        double nota3 = input.nextDouble();

        Notas notas = new Notas();

        notas.setNota1(nota1);
        notas.setNota2(nota2);
        notas.setNota3(nota3);

        System.out.printf("Notas: de %.2f, %.2f, %.2f  \n", nota1 , nota2 , nota3 );
        System.out.printf("Media: %.2f ", notas.medias());
    }

}