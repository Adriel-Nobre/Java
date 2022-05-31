package com.company;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Adriel", 100200300);
        Cliente cli2 = new Cliente("Fulano", 123456789);


        Conta conta1 = new ContaPoupanca(cliente1);
        Conta conta2 = new ContaCorrente(cli2);

        conta1.setSaldo(500);
        conta1.transferir(150,conta2);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();

        Banco banco1 = new Banco();
        banco1.setContas(conta1);
        banco1.setContas(conta2);

        System.out.println(banco1.getContas());


    }
}
