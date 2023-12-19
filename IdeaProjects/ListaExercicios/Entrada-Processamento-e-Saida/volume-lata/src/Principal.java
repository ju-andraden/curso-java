import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double raioLata;
        double alturaLata;

        var entrada = new Scanner(System.in);

        System.out.print("Digite o raio da lata: ");
        raioLata = entrada.nextDouble();

        System.out.print("Digite a altura da lata: ");
        alturaLata = entrada.nextDouble();

        var volumeLata = 3.14159 * raioLata * raioLata * alturaLata;

        System.out.printf("O valor do volume da lata é: %.2f", volumeLata);
    }
}
