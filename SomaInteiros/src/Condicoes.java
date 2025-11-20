import java.util.Scanner;

public class Condicoes {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.printf("Digite o primeiro numero:");
        number1 = input.nextInt();

        System.out.printf("Digite o segundo numero:");
        number2 = input.nextInt();

        if(number1 == number2)
            System.out.printf("%d == %d%n" , number1 , number2);

        if(number1 != number2)
            System.out.printf("%d != %d%n" , number1 , number2);

        if(number1 > number2)
            System.out.printf("%d > %d%n" , number1 , number2);

        if(number1 >= number2)
            System.out.printf("%d >= %d%n" , number1 , number2);

        if(number1 < number2)
            System.out.printf("%d < %d%n" , number1 , number2);

        if(number1 <= number2)
            System.out.printf("%d <= %d%n" , number1 , number2);
    }
}
