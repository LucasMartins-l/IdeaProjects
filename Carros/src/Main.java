
public class Main {
    public static void main(String[] args) throws InterruptedException {

        ModelCarro modelcarro = new ModelCarro(
                "Civic",
                1.4,
                4,
                "Black");

        modelcarro.getCarro();

        int larguraTela = 100;
        int posicao = larguraTela;

        while (posicao >= 0) {
            String espacos = " ".repeat(posicao);


            System.out.print("\r" + espacos + "🚗💨");

            Thread.sleep(50);

            posicao--;
        }

        System.out.println();
    }
}