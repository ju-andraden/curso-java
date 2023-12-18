import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A, B, C, D;
        int adicao, multiplicacao;

        System.out.println("Digite o valor de A: ");
        A = entrada.nextInt();

        System.out.println("Digite o valor de B: ");
        B = entrada.nextInt();

        System.out.println("Digite o valor de C: ");
        C = entrada.nextInt();

        System.out.println("Digite o valor de D: ");
        D = entrada.nextInt();

        System.out.printf("A soma de A + B é: " + (A + B) + " e a multiplicação de A * B é: " + (A * B) + ".\n");
        System.out.printf("A soma de A + C é: " + (A + C) + " e a multiplicação de A * C é: " + (A * C) + ".\n");
        System.out.printf("A soma de A + D é: " + (A + D) + " e a multiplicação de A * D é: " + (A * D) + ".\n");
        System.out.printf("A soma de B + C é: " + (B + C) + " e a multiplicação de B * C é: " + (B * C) + ".\n");
        System.out.printf("A soma de B + D é: " + (B + D) + " e a multiplicação de B * D é: " + (B * D) + ".\n");
        System.out.printf("A soma de C + D é: " + (C + D) + " e a multiplicação de C * D é: " + (C * D) + ".\n");

    }
}
