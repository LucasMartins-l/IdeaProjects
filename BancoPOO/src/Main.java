
public class Main {
    public static void main(String[] args) {

        Banco c1 = new Banco();
        Banco c2 = new Banco();

        c1.setNumConta(12345);
        c1.setDono("lucas");
        c1.abrirConta("CC");
        c1.depositar(100);
        c1.sacar(25);


        c1.estadoAtual();

        c2.setNumConta(1111);
        c2.setDono("Gabriel");
        c2.abrirConta("CP");
        c2.depositar(120);
        c2.sacar(100);


        c2.estadoAtual();
    }
}