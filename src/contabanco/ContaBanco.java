package contabanco;

public class ContaBanco {

    public int numConta;
    protected String tipoConta;
    private String titular;
    private double saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("=============================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Titular: " + this.getTitular());
        System.out.printf("Saldo: R$%.2f ", this.getSaldo());
        System.out.println("\nStatus: " + this.getStatus());
    }

    public void abrirConta(String tipoConta){
        this.setTipoConta(tipoConta);
        this.setStatus(true);
        if(tipoConta == "CC"){
           this.setSaldo(50);
        }else if(tipoConta == "CP"){
            this.setSaldo(150);
        }
        System.out.println("CONTA ABERTA COM SUCESSO!");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com saldo não pode ser encerrada");
        }else if(this.getSaldo() < 0){
            System.out.println("Saldo negativo, não pode ser encerrada!");
        }else{
            this.setStatus(false);
            System.out.println("CONTA ENCERRADA COM SUCESSO!");
        }
    }
    public void depositar(double valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado na conta de " + this.getTitular());
        }else{
            System.out.println("Conta inexistente, imposível depositar.");
        }
    }
    public void sacar(double valor){
         if (this.getStatus()){
             if (this.getSaldo() >= valor){
                 this.setSaldo(this.getSaldo() - valor);
                 System.out.println("Saque processado com sucesso na conta de " + this.getTitular());
             }else {
                 System.out.println("Saldo insuficiente, saque não processado!");
             }
         }else {
             System.out.println("Conta inexistente, impossível processar o saque!");
         }
    }
    public void pagarMensal(){
        int valor = 0;
        if(this.getTipoConta() == "CP"){
            valor = 12;
        }else if(this.getTipoConta() == "CC") {
            valor = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso!");
        }else {
            System.out.println("Conta inexistente, impossível pagar mensalidade!");
        }
    }
    public ContaBanco() {
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.titular = titular;
        this.saldo = saldo;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = true;
    }
}
