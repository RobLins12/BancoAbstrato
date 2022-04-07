package BancoBia;

import java.util.ArrayList;

public class Banco implements Interface{
    ArrayList<ContaBancaria> contas = new ArrayList<>();

    public void inserir(ContaBancaria c){
        contas.add(c);
    } 
    public void remover(ContaBancaria c){
        contas.remove(c);
    }
    public ContaBancaria procurarConta(int num){
        for (ContaBancaria contaBancaria : contas) {
            if (contaBancaria.numeroDaConta == num) {
                return contaBancaria;
            }
        }
        return null;
    }

    @Override
    public double mostraDados() {
        return 0;
    }
}
