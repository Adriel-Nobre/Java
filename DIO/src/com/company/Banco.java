package com.company;

import java.util.ArrayList;

public class Banco {

    private ArrayList<Conta> contas = new ArrayList<>();

    public void setContas(Conta conta) {
        this.contas.add(conta);
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }
}
