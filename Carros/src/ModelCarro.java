public class ModelCarro {

    private String modelo ;
    private String cor;
    private int portas;
    private double motor;

    public ModelCarro(String modelo, double motor, int portas, String cor) {
        this.modelo = modelo;
        this.motor = motor;
        this.portas = portas;
        this.cor = cor;
    }

    public void getCarro (){
        System.out.println("Modelo " +modelo);
        System.out.println("Motor " +motor);
        System.out.println("porta " +portas);
        System.out.println("cor " +cor);

    }
}
