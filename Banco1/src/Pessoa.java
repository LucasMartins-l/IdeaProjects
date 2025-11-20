import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private double saldo;
    private double saldoInicial;
    private List<Double> extratos = new ArrayList<>();

    public Pessoa(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
        this.saldoInicial = saldoInicial;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            extratos.add(valor);
        } else {
            System.out.println("Valor inválido");
        }
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            extratos.add(-valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente para " + nome);
            return false;
        }
    }

    public void mostrarExtratos() {
        System.out.println("Extratos de " + nome + ":");
        double saldoTemp = saldoInicial;

        for (double t : extratos) {
            if (t > 0) {
                saldoTemp += t;
                System.out.printf("+%.2f  | saldo: %.2f%n", t, saldoTemp);
            } else {
                if (saldoTemp + t < 0) {
                    System.out.printf("%+.2f  | saldo: %.2f (saque não permitido)%n", t, saldoTemp);
                } else {
                    saldoTemp += t;
                    System.out.printf("%+.2f  | saldo: %.2f%n", t, saldoTemp);
                }
            }
        }
    }
}
