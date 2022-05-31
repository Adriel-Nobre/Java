package com.company;

public class ContaPoupanca extends Conta implements IRendimento {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== CONTA POUPANCA ===");
        super.imprimirExtrato();
    }

    @Override
    public double rendimentoMensal(double porcentagem) {
        //calculo da porcentagem sobre a poupança
        return 0;
    }
}
