import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;

        var entrada = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        a = entrada.nextInt();

        System.out.print("Digite o valor de B: ");
        b = entrada.nextInt();

        System.out.print("Digite o valor de C: ");
        c = entrada.nextInt();

        System.out.print("Digite o valor de D: ");
        d = entrada.nextInt();

        System.out.println("A soma de A + B é: " + (a + b) + " e a multiplicação de A * B é: " + (a * b));
        System.out.println("A soma de A + C é: " + (a + c) + " e a multiplicação de A * C é: " + (a * c));
        System.out.println("A soma de A + D é: " + (a + d) + " e a multiplicação de A * D é: " + (a * d));
        System.out.println("A soma de B + C é: " + (b + c) + " e a multiplicação de B * C é: " + (b * c));
        System.out.println("A soma de B + D é: " + (b + d) + " e a multiplicação de B * D é: " + (b * d));
        System.out.println("A soma de C + D é: " + (c + d) + " e a multiplicação de C * D é: " + (c * d));
    }
}
