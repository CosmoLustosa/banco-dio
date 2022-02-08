package br.com.cosmolustosa.entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private int codigo;
    private String nome;

    List<Conta> minhasContas = new ArrayList<>();

    public Banco(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaConta(Conta c) {
        minhasContas.add(c);
    }

    public void exibeContas() {
        for (Conta c : minhasContas) {
            System.out.println("Numero da Conta: "+ c.getNumero() + " " + c.getCliente());
        }
    }

}
