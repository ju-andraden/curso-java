public class ServicoDePrecificacao {

    void definirPrecoVenda(final Produto produto, final double percentualMargemLucro) {

         double precoVendaCalculado = Matematica.calcularAcrescimo(
                 produto.precoCusto, percentualMargemLucro);

         precoVendaCalculado += Produto.custoEmbalagem;

         produto.precoVenda = precoVendaCalculado;
    }
}
