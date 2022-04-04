package BancoBia;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();


        contaCorrente.depositar(100);
        contaCorrente.sacar(45);

        System.out.println("oi seu saldo é:" + contaCorrente.saldo);

        contaPoupanca.depositar(100);
        contaPoupanca.sacar(110);

        System.out.println("oi seu saldo da conta poupança é: " + contaPoupanca.saldo);
    }
}
