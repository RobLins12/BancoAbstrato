package BancoBia;

public class ContaPoupanca extends ContaBancaria implements Interface{
   
    private double limite = 20;

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
        
    @Override
    public double mostraDados() {
       return this.limite;
    }

    @Override
    public boolean sacar(double valor) { 

        if (valor > this.saldo){
            this.saldo+=this.limite;
            
            if(this.saldo>=valor){
                this.saldo = 0;
                return true;
            } else {
                return false;
            }
            
        } else {
            this.saldo -= valor;
            return true;
        }
    }

}
