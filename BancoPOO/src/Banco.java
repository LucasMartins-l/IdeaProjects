public class Banco {

    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("---------------------------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }
    public Banco(){
        this.saldo = 0 ;
        this.status = false;
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);

        if (tipo.equals("CC")){
            this.setSaldo(50);
        }
        else if (tipo.equals("CP")){
            this.setSaldo(100);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if(getSaldo()  > 0 ){
            System.out.println("Impossivel Conta com saldo :" +getSaldo());
        }else if (getSaldo() < 0 ){
            System.out.println("Impossivel Conta em Debito");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta :"+ getDono() + "fechada com Sucesso!");
        }
    }
    public void depositar(double valor){
        if(getStatus()){
            this.setSaldo(getSaldo() + valor);
            System.out.printf("Depósito realizado para %s no valor de R$ %.2f\n", getDono(), valor);

        }
        else{
            System.out.println("Impossivel depositar em conta fechada ");
        }

    }
    public void sacar(double valor){
        if(getStatus()) {
            if (getSaldo() >= valor) {
                this.setSaldo(getSaldo() - valor);
                System.out.printf("Saque realizado de %s no valor: %.2f%n" ,getDono(), valor);
            } else {
                System.out.println("Saldo insuficiente para saque  ");
            }
        }
        else
            System.out.println("Impossievel sacar de uma conta fechada");

    }
    public void pagarMensal(){
        double valor = 0;

        if(getTipo().equals("CC")){
            valor = 10;
        }else if (getTipo().equals("CP")){
            valor = 5;
        }
        if (getStatus()){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("mensalidade paga com sucesso!");
        }
        else {
            System.out.println("Impossivel pagar com conta fechada!");
        }

    }

    public void setNumConta( int numConta){
        this.numConta = numConta;
    }

    public int getNumConta(){
        return numConta ;
    }

    public void setTipo( String tipo){
        this.tipo = tipo;

    }

    public String getTipo(){
        return tipo;

    }
    public void setDono(String dono){
        this.dono = dono;

    }

    public String getDono(){
        return dono;

    }
    public void setSaldo( double saldo){
        this.saldo = saldo;

    }

    public double getSaldo (){
        return saldo;

    }
    public void setStatus( boolean status){
        this.status = status;

    }
    public boolean getStatus (){
        return status;
    }
}