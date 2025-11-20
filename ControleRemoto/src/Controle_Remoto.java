public class Controle_Remoto implements Bottoes{

    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Metado Constructor
    public  Controle_Remoto(){
        volume = 40;
        ligado = false;
        tocando = false;


    }
    private void setVolume(int volume){
        this.volume = volume;

    }
    private int getVolume(){
        return volume;

    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;

    }
    private boolean getLigado(){
        return ligado;

    }
    private void setTocando( boolean tocando){
        this.tocando = tocando;

    }

    private boolean getTocando(){
        return tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);

    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void menu() {
        System.out.printf("ligado: %b%n" , getLigado());
        System.out.printf("tocando: %b%n" , getTocando());
        System.out.printf("Volume: %d" , getVolume());

        for(int i = 0; i <= getVolume(); i +=1 ) {
            System.out.print("|");
        }
    }

    @Override
    public void maisVolume() {
        if(getLigado()){
            setVolume(getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (getLigado()){
            setVolume(getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(getLigado() && getVolume() > 0 ){
            setVolume(0);
        }

    }

    @Override
    public void desligarMudo() {
        if(getLigado() && getVolume() == 0){
            setVolume(40);
        }
    }

    @Override
    public void pley() {
        if(getLigado() && !getTocando()){
            setTocando(true);
        }else{
            System.out.println("Impossivel dispositivo desligado");

        }
    }

    @Override
    public void pause() {
        if(getLigado() && getTocando()){
            setTocando(false);
        }else{
            System.out.println("Impossivel dispositivo desligado");

        }
    }
}
