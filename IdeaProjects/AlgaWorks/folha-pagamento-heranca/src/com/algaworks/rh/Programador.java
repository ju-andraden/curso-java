package com.algaworks.rh;

public class Programador extends Funcionario {

    private double valorBonus;

    public Programador(String nome, double valorHora) {
        super(nome, valorHora);
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        if (valorBonus < 0) {
            throw new IllegalArgumentException("O valor do bônus deve ser maior que 0.");
        }

        this.valorBonus = valorBonus;
    }

    @Override
    protected final double calcularSario(int horasTrabalhadas) {
        return super.calcularSario(horasTrabalhadas) + valorBonus;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome ='" + getNome() + '\'' +
                ", valorHora =" + getValorHora() +
                ", valorBonus =" + valorBonus +
                '}';
    }
}
