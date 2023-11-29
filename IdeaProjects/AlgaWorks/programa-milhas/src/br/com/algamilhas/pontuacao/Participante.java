package br.com.algamilhas.pontuacao;

import java.util.Objects;

public class Participante {

    public String nome;
    public int saldoDePontos;

    public Participante(String nome) {
        this(nome, 0);
    }

    public Participante(String nome, int saldoDePontosInicial) {
        Objects.requireNonNull(nome, "Nome é obrigatório.");

        if (saldoDePontosInicial < 0) {
            throw new IllegalArgumentException("O saldo inicial de pontos não pode ser negativo.");
        }

        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;
    }

    private void creditarPontos(int pontos) {
        if (pontos < 0) {
            throw new IllegalArgumentException("Pontos a creditar não podem ser negativos.");
        }

        this.saldoDePontos += pontos;
    }
}
