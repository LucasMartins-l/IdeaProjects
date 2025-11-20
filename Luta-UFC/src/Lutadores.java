public class Lutadores {

    private String nome;
    private String apelido;
    private String regiao;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoria , derrota , empate ;


    public Lutadores(String nome,
                     String apelido,
                     String regiao,
                     int idade,
                     double altura,
                     double peso,
                     int vitoria, int derrota, int empate) {


        this.nome = nome;
        this.apelido = apelido;
        this.regiao = regiao;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;

    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public String getCategoria() {
        return categoria;
    }


    public void setCategoria() {
        if (getPeso() < 52.2 ){
            this.categoria = "Inválido";
        }else if (getPeso() <= 70.3){
            this.categoria = "Leve";
        }else if (getPeso() <= 83.9){
            this.categoria = "Medio";
        }else if (getPeso() <=120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void apresentar(){
        System.out.printf("___________Apresentamos o lutador!!!!_____________ %n%n");
        System.out.println("Lutador: " + getNome());
        System.out.println("Apelido: " + getApelido());
        System.out.println("Regiao: " + getRegiao());
        System.out.println("Idade: " + getIdade() +" Anos");
        System.out.println("Altura: " + getAltura() +"cm");
        System.out.println("Peso: " + getPeso() +"KG");
        System.out.println("Vitorias: " + getVitoria() +" Vezes");
        System.out.println("Derrota: " + getDerrota() +" Vezes");
        System.out.printf("Empate: " + getEmpate() +" Vezes %n%n");
    }

    public void status(){
        System.out.printf("___________Status do Lutador!!!!_____________ %n%n");
        System.out.println("Nome: " + getNome());
        System.out.println("Categoria " + getCategoria());
        System.out.println("Vitorias: " + getVitoria() +" Vezes");
        System.out.println("Derrota: " + getDerrota() +" Vezes");
        System.out.println("Empate: " + getEmpate() +" Vezes");

    }

    public void ganharLuta(){
        setVitoria(getVitoria() +1 );
    }

    public void perderLuta(){
        setDerrota(getDerrota() +1 );
    }

    public void empatarLuta(){
        setEmpate(getEmpate() +1 );
    }
}
