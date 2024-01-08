package com.algaworks.impostos;

public class GestorDeImpostos {

    private double valorTotalImpostos;

    public void adicionar(Pessoa pessoa) {
        double imposto = pessoa.calcularImpostos();

        //this.valorTotalImpostos = this.valorTotalImpostos + imposto;
        this.valorTotalImpostos += imposto;
    }

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }
}
