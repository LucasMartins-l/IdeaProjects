import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numero1;
    int numero2;
    int soma;

    System.out.printf("Digite o primeiro numero:");
    numero1 = input.nextInt();

    System.out.printf("Digite o segundo numero:");
    numero2 = input.nextInt();

    soma = numero1 + numero2;

    System.out.printf("A soma de: %d+%d = %d" , numero1 ,numero2 , soma);

    }
}