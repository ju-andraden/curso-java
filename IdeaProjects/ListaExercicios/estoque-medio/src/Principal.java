import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double qtdMinima;
        double qtdMaxima;

        System.out.println("Digite a quantidade minima de estoque: ");
        qtdMinima = entrada.nextDouble();

        System.out.println("Digite a quantidade maxima de estoque: ");
        qtdMaxima = entrada.nextDouble();

        double estoqueMedio = (qtdMinima + qtdMaxima) / 2;

        System.out.println("Estoque médio: " + estoqueMedio);
    }
}
