import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private List<String> nomes = new ArrayList<>();
    private List<Integer> idades = new ArrayList<>();
    private List<String> sexos = new ArrayList<>();

    public void adicionarPessoas(String nome, Integer idade, String sexo) {

        nomes.add(nome);
        idades.add(idade);
        sexos.add(sexo);
    }
    public int quantidadePessoas(){
        return nomes.size();
    }


    public void mostrarPessoas() {
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i));
            System.out.println("Idade: " + idades.get(i));
            System.out.println("Sexo: " + sexos.get(i));
            System.out.println("-------------------");
        }
    }
}
