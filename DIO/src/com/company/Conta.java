package com.company;

public abstract class Conta {

    private static final int AGENCIA_PADRAO = 100;
    private static  int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroDaConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numeroDaConta = SEQUENCIAL++;
        this.cliente = cliente;
    }


    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double valor) {
        saldo = valor;
    }


    public void sacar(double valor){
        saldo -= valor;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirExtrato(){
        System.out.println(String.format("Titular : %s", this.cliente.nome));
        System.out.println(String.format("Agencia : %d", this.agencia));
        System.out.println(String.format("Numero da conta : %d", this.numeroDaConta));
        System.out.println(String.format("Saldo : %.2f", this.saldo));

    }

}
