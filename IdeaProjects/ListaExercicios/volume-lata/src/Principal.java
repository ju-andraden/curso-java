import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double raioLata;
        double alturaLata;

        System.out.println("Digite o raio da lata:");
        raioLata = entrada.nextDouble();

        System.out.println("Digite a altura da lata:");
        alturaLata = entrada.nextDouble();

        double volumeLata = 3.14159 * raioLata * raioLata * alturaLata;

        System.out.printf("O valor do volume da lata é: %.2f%n", volumeLata);
    }
}
