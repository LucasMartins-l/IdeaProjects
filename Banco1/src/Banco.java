import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Pessoa> pessoas = new ArrayList<>();

    public void adicionarPessoa(Pessoa p) {
        pessoas.add(p);
    }

    public Pessoa buscarPessoa(String nome) {
        for (Pessoa p : pessoas) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }


    public void pix(String remetenteNome, String destinatarioNome, double valor) {
        Pessoa remetente = buscarPessoa(remetenteNome);
        Pessoa destinatario = buscarPessoa(destinatarioNome);

        if (remetente == null || destinatario == null) {
            System.out.println("Remetente ou destinatário não encontrado!");
            return;
        }

        if (remetente.sacar(valor)) {
            destinatario.depositar(valor);
            System.out.println("PIX realizado com sucesso!");
        } else {
            System.out.println("PIX não realizado. Saldo insuficiente.");
        }
    }
}
