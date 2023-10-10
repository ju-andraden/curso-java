public class FolhaPagamento {

    Holerite calcularSalario(int horasNormais, int horasExtras,
                           ContratoTrabalho contratoTrabalho) {

        Holerite holerite = new Holerite();
        holerite.funcionario = contratoTrabalho.funcionario;
        holerite.valorTotalHorasNormais = horasNormais * contratoTrabalho.valorHoraNormal;
        holerite.valorTotalHorasExtras = horasExtras * contratoTrabalho.valorHoraExtra;

        double subtotal = holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtras;

        if (contratoTrabalho.possuiAdicionalFilhos()) {
            holerite.valorAdicionalFilhos = subtotal * 0.10;
        }

        return holerite;
    }
}
