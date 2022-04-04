package BancoBia;

public class ContaCorrente extends ContaBancaria implements Interface{

    private double taxaDeOperacao = 0.1;

    @Override
    public void depositar(double valor) {

        valor = valor - (valor * taxaDeOperacao); 

        this.saldo += valor;
    }
        
    @Override
    public double mostraDados() {
       return this.taxaDeOperacao;
    }

    @Override
    public boolean sacar(double valor) { 

        valor = valor - (valor * taxaDeOperacao);
        
        if (valor > this.saldo){
            return false;
        } else {
            
            this.saldo -= valor;
            return true;
        }
    }
    
}