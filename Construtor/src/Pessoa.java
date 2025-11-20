public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa (String nome , int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void mostrarInformacao1() {
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d%n", idade);
        System.out.printf("=========================%n");
    }
    
    public String mostrarInformacao2() {
        return "Nome: " + nome + "\nIdade: " + idade +
                "\n---------------------------";
    }
}
