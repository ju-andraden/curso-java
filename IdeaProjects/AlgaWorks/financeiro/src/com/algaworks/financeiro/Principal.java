package com.algaworks.financeiro;

public class Principal {

    public static void main(String[] args) {
        Fornecedor imobiliaria = new Fornecedor("Ju Negócios Imobiliários");

        ContaPagar contaAluguel = new ContaPagar();
        contaAluguel.setDescricao("Aluguel da casa");
        contaAluguel.setValor(2500);
        contaAluguel.setDataVencimento("22/12/2023");
        contaAluguel.setFornecedor(imobiliaria);

        imprimirConta(contaAluguel);

        contaAluguel.pagar();
        imprimirConta(contaAluguel);

        // Pagar a mesma conta novamente deve ser impedido
        //contaAluguel.pagar();

        contaAluguel.cancelarPagamento();
        imprimirConta(contaAluguel);

        // Cancelar o pagamento de uma conta pendente deve ser impedido
        // contaAluguel.cancelarPagamento();
    }

    public static void imprimirConta(ContaPagar conta) {
        System.out.printf("Fornecedor: %s%n", conta.getFornecedor().getNome());
        System.out.printf("Descrição: %s%n", conta.getDescricao());
        System.out.printf("Data de vencimento: %s%n", conta.getDataVencimento());
        System.out.printf("Valor: R$%.2f%n", conta.getValor());
        System.out.printf("Pago? %s%n", conta.isPago() ? "Sim." : "Não.");
        System.out.println();
    }
}
