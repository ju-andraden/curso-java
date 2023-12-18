import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A, B, C, D;

        System.out.println("Digite o valor de A: ");
        A = entrada.nextInt();

        System.out.println("Digite o valor de B: ");
        B = entrada.nextInt();

        System.out.println("Digite o valor de C: ");
        C = entrada.nextInt();

        System.out.println("Digite o valor de D: ");
        D = entrada.nextInt();

        System.out.println("A soma de A + B é: " + (A + B) + " e a multiplicação de A * B é: " + (A * B));
        System.out.println("A soma de A + C é: " + (A + C) + " e a multiplicação de A * C é: " + (A * C));
        System.out.println("A soma de A + D é: " + (A + D) + " e a multiplicação de A * D é: " + (A * D));
        System.out.println("A soma de B + C é: " + (B + C) + " e a multiplicação de B * C é: " + (B * C));
        System.out.println("A soma de B + D é: " + (B + D) + " e a multiplicação de B * D é: " + (B * D));
        System.out.println("A soma de C + D é: " + (C + D) + " e a multiplicação de C * D é: " + (C * D));

    }
}
