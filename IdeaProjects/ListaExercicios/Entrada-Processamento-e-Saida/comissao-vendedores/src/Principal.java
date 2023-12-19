import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int codigoVendedor;
        int codigoPeca;
        double precoPeca;
        int quantidadePecas;
        double comissaoVenda = 0.5;

        var entrada = new Scanner(System.in);

        System.out.print("Digite a identificação do vendedor: ");
        codigoVendedor = entrada.nextInt();

        System.out.print("Digite o código da peça: ");
        codigoPeca = entrada.nextInt();

        System.out.print("Digite o preço unitário da peça: ");
        precoPeca = entrada.nextDouble();

        System.out.print("Digite a quantidade de peças vendidas: ");
        quantidadePecas = entrada.nextInt();

        var valorComissao = (precoPeca * quantidadePecas) * comissaoVenda;

        System.out.println("---------------------");
        System.out.println("Código do vendedor: " + codigoVendedor);
        System.out.println("Código da peça: " + codigoPeca);
        System.out.println("Preço da peça: " + precoPeca);
        System.out.println("Quantidade de peças: " + quantidadePecas);
        System.out.printf("O valor da comissão será de: R$ %.2f%n", valorComissao);
    }
}
