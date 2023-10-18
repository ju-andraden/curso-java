public class CadastroPortaria {

    static final int TEMPO_EXPIRACAO_EM_MESES = 1;

    void cadastrar(final Visitante visitante) {
        this.cadastrar(visitante, TEMPO_EXPIRACAO_EM_MESES);
    }
    void cadastrar(final Visitante visitante, final int tempoExpiracaoEmMeses) {
        final int tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrada para %d dias.%n",
                visitante.nome, tempoExpiracaoEmDias);
    }
}
