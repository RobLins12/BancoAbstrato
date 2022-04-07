package BancoBia;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(100023);
        ContaPoupanca contaPoupanca = new ContaPoupanca(100034);


        contaCorrente.depositar(100);
        try {
            contaCorrente.sacar(130);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("oi seu saldo é:" + contaCorrente.saldo);

        contaPoupanca.depositar(100);
        contaPoupanca.sacar(110);

        System.out.println("oi seu saldo da conta poupança é: " + contaPoupanca.saldo);

        Banco bia = new Banco();
        bia.inserir(contaCorrente);
        bia.inserir(contaPoupanca);
        bia.mostraDados();
    }
}
