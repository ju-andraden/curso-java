import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idVendedor;
        int codigoPeca;
        double precoPeca;
        double qtdPecas;
        double valorComissao;
        double comissaoVenda = 0.5;

        System.out.println("Digite a identificação do vendedor: ");
        idVendedor = entrada.nextInt();

        System.out.println("Digite o código da peça: ");
        codigoPeca = entrada.nextInt();

        System.out.println("Digite o preço unitário da peça: ");
        precoPeca = entrada.nextDouble();

        System.out.println("Digite a quantidade de peças vendidas: ");
        qtdPecas = entrada.nextDouble();

        valorComissao = (precoPeca * qtdPecas) * comissaoVenda;

        System.out.printf("O valor da comissão será de: R$%.2f.\n ", valorComissao);
    }
}
