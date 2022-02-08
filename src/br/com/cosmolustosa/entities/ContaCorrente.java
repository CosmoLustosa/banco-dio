package br.com.cosmolustosa.entities;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente c) {
        super(c);
    }

    @Override
    public void sacar(double valor) {
        if((this.getSaldo() > 0) &&(valor <= this.getSaldo())){
            this.setSaldo(this.getSaldo() - valor);
        }

    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("**** Tipo: Conta Corrente *****\n" +
                "Titular: " + this.getCliente().toString() + "\n" +
                "Saldo: "+ this.getSaldo() + "\n" +
                "");

    }
}
