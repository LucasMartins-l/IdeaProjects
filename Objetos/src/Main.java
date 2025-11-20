
public class Main {
    public static void main(String[] args) {

    Caneta caneta = new Caneta();


    caneta.modelo = "big";
    caneta.cor = "preta";
    caneta.ponta = 0.5;
    caneta.carga = 90;
    caneta.desTampar();
    caneta.rabiscar();
    caneta.status();
    System.out.println(" ");

    Caneta caneta1 = new Caneta();

    caneta1.modelo = "killoes";
    caneta1.cor = "Azul";
    caneta1.ponta = 1.5;
    caneta1.carga = 20;
    caneta1.tampar();
    caneta1.rabiscar();
    caneta1.status();


    }
}