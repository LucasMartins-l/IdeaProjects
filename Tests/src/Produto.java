import java.util.List;


public class Produto {

    private static int contadorID = 0 ;

    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.id = contadorID++;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int qtd) {
        quantidade += qtd;
    }

    public void removerEstoque(int qtd) {
        if (qtd <= quantidade) {
            quantidade -= qtd;
        } else {
            System.out.println("❌ Quantidade insuficiente em estoque!");
        }
    }

    public void mostrarInfo() {
        String idFormatado = String.format("%08d", id);
        System.out.printf("ID: %s | Nome: %s | Preço: R$ %.2f | Quantidade: %d \uD83C\uDF4C%n",
                idFormatado ,nome, preco, quantidade);
        System.out.println("_______________________________________________________________");
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
