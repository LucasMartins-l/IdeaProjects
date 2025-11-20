import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Scanner input = new Scanner (System.in);

        System.out.println("Nome");
        String nome = input.nextLine();
        estudante.setNome(nome);

        boolean notaValida = false;

        while (!notaValida) {
            System.out.println("Nota");
            double nota = input.nextDouble();

           notaValida = estudante.setNota(nota);
        }
        estudante.mostrarInfo();

        if (estudante.aprovado()) {
            System.out.println("Status: Aprovado 🎉");
        } else {
            System.out.println("Status: Reprovado 😢");
            System.out.println();
        }
    }
}