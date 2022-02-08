package com.br.cosmolustosa.entities;

public abstract class Conta implements IConta{
    private static int AGENCIA_PADRAO = 1;
    private static int numeroConta = 0;

    protected int agencia;
    protected int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = numeroConta++;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
