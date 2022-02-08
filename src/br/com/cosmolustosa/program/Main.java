package br.com.cosmolustosa.program;
import br.com.cosmolustosa.entities.*;

public class Main {
    public static void main(String[] args) {
        Banco bb = new Banco(1,"Banco do Brasil");
        Cliente cosmo = new Cliente("Cosmo Lustosa da Silva", 32);
        Cliente ana = new Cliente("Ana Pereira Silva", 45);
        Conta cp = new ContaPoupanca(ana);
        Conta cc = new ContaCorrente(cosmo);
        cc.depositar(100.00);
        cc.depositar(50.00);
        cc.depositar(3000.00);
        cc.imprimirExtrato();

        /* *******Transferindo dinheiro para Ana ************** */
        System.out.println(" ==== *****Transferindo dinheiro para Ana ****** ===");
        cc.transferir(380.00, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        //Adicionando as contas no banco
        bb.adicionaConta(cp); //adiciona a conta poupança
        bb.adicionaConta(cc); //adiciona a conta corrente
        System.out.println("==== Listando as contas do banco =====");
        bb.exibeContas();

    }
}
