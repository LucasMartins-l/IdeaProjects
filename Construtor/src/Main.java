//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Lucas",3);
        Pessoa pessoa2 = new Pessoa("Gabriel",4);

        pessoa1.mostrarInformacao1();
        pessoa2.mostrarInformacao1();

        System.out.println(pessoa1.mostrarInformacao2());
        System.out.println(pessoa2.mostrarInformacao2());
    }
}