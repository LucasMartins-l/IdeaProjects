import java.util.Random;

public class Luta {

    private Lutadores desafiante;
    private Lutadores desafiado;
    private int rouds;
    private boolean aprovada;

    public void marcarLuta(Lutadores L1 , Lutadores L2){
        if (L1.getCategoria().equals(L2.getCategoria()) && L1 !=L2) {
            this.desafiante = L1;
            this.desafiado = L2;
            this.aprovada = true;
        }else{
            this.desafiante = null;
            this.desafiado = null;
            this.aprovada = false ;
        }
    }
    public void lutar(){
        if(aprovada){
            System.out.println("_______Desafiante______");
            desafiante.apresentar();
            System.out.println("_______Desafiado______");
            desafiado.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){

                case 0:  // Empate.
                    System.out.println("_______Luta terminou em Empate______");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:  // Desafiante Vence.
                    System.out.printf("_______Desafiante %s Venceu ______%n",desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:  // Desafiado Vence.
                    System.out.printf("_______Desafiado %s Venceu ______%n",desafiado.getNome());
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
            }
        }else{
            System.out.printf("ERRO 404.%nA Luta nao pode acontecer!%n%n");
        }
    }

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
