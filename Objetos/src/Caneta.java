public class Caneta {

    String modelo;
    String cor;
    int carga;
    double ponta;
    boolean tampada;

    void status(){
        System.out.println("modelo da caneta " + this.modelo);
        System.out.println("cor da caneta " + this.cor);
        System.out.println("carga da caneta " + this.carga);
        System.out.println("pronta da caneta " + this.ponta);
        System.out.println("Caneta esta tampada " + this.tampada);
    }
    void rabiscar(){
        if (this.tampada) {
            System.out.println("ERRO: Não posso rabiscar com a caneta tampada!");
        } else {
            System.out.println("Estou rabiscando...");
        }
    }

    void tampar(){

        this.tampada = true;
    }

    void desTampar(){

        this.tampada = false;
    }

}
