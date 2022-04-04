package BancoBia;

public abstract class ContaBancaria{
    protected int numeroDaConta;
    protected double saldo;

    abstract public boolean sacar (double valor);
    abstract public void depositar (double valor);

}
