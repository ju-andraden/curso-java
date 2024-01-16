package com.algaworks.rh;

import java.util.Objects;

public class Funcionario {

    private String nome;
    private double valorHora;

    public Funcionario(String nome, double valorHora) {
        setNome(nome);
        setValorHora(valorHora);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora < 0) {
            throw new IllegalArgumentException("O valor da hora deve ser maior que 0.");
        }

        this.valorHora = valorHora;
    }

    protected double calcularSario(int horasTrabalhadas) {
        return horasTrabalhadas * getValorHora();
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno) {
        double valorSalario = calcularSario(horasTrabalhadas);

        return new Holerite(getNome(), mesAno, valorSalario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", valorHora=" + valorHora +
                '}';
    }
}
