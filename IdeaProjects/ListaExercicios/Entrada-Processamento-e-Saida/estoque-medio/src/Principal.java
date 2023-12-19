import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double quantidadeMinima;
        double quantidadeMaxima;

        var entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade minima de estoque: ");
        quantidadeMinima = entrada.nextDouble();

        System.out.print("Digite a quantidade maxima de estoque: ");
        quantidadeMaxima = entrada.nextDouble();

        var estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

        System.out.println("Quantidade minima de estoque: " + quantidadeMinima);
        System.out.print("Quantidade maxima de estoque: " + quantidadeMaxima);
        System.out.print("Estoque médio: " + estoqueMedio);
    }
}
