package BancoBia;

public class ContaCorrente extends ContaBancaria implements Interface{

    public ContaCorrente(int numero) {
        super(numero);
    }

    private double taxaDeOperacao = 0.1;

    @Override
    public void depositar(double valor) {

        valor = valor - (valor * taxaDeOperacao); 

        this.saldo += valor;
    }
        
    @Override
    public void mostraDados() {
       System.out.println(this.taxaDeOperacao);
    }

    @Override
    public boolean sacar(double valor) throws Exception{ 

        valor = valor - (valor * taxaDeOperacao);
        
        if (valor > this.saldo){
            throw new Exception("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            return true;
        }
    }
    
}
