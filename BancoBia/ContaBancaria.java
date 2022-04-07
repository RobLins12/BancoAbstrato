package BancoBia;

public abstract class ContaBancaria{
    protected int numeroDaConta;
    protected double saldo;

    public void transferir(double valor, ContaBancaria c) throws Exception{
        this.sacar(valor);
        c.depositar(valor);
    }
    abstract public boolean sacar (double valor) throws Exception;
    abstract public void depositar (double valor);

}
