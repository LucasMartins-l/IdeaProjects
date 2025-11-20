public class Notas {

    private String nome;
    private double nota;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNota(double nota) {

        if(nota >= 0 && nota<=100.0){
              this.nota = nota;
        }else{
            System.out.println("Nota inválida");
        }
    }

    public double getNota(){
        return nota;
    }

    public String getLetra(){
        String letra = "";

        if (nota>= 90.0 ) {
            letra = "A";

        }else if (nota>= 80.0) {
            letra = "b ";

        }else if (nota >= 70.0)
        letra = "C";

        else if (nota>= 60.0) {
            letra = "d";

        }else
        letra = " F";

        return letra ;
    }
}
