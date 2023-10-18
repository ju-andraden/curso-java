public class ServicoDePrecificacao {

    void definirPrecoVenda(final Produto produto, final double percentualMargemLucro) {

         var precoVendaCalculado = Matematica.calcularAcrescimo(
                 produto.precoCusto, percentualMargemLucro);

         precoVendaCalculado += Produto.custoEmbalagem;

         produto.precoVenda = precoVendaCalculado;
    }
}
