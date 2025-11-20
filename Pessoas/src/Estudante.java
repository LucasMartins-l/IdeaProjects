public class Estudante {

    private String nome;
    private double nota;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public boolean setNota(double nota) {
        if (nota >= 0.0 && nota <= 100.00) {
            this.nota = nota;
            return true;
        } else {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 100.");
            return false;
        }
    }

    public double getNota() {
        return nota;
    }
    public void mostrarInfo(){
        System.out.println("Nome:"+getNome());
        System.out.println("nota:"+getNota());
    }
    public boolean aprovado(){
        return nota >=60.0;
    }
}
