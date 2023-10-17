public class CadastroPortaria {
    void cadastrar(final Visitante visitante, final int tempoExpiracaoEmMeses) {
        final int tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrada para %d dias.%n",
                visitante.nome, tempoExpiracaoEmDias);
    }
}
