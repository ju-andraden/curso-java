import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double contacaoDolar;
        double valorEmDolar;

        var entrada = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar (USD): ");
        contacaoDolar = entrada.nextDouble();

        System.out.print("Digite o valor em dólar (USD): ");
        valorEmDolar = entrada.nextDouble();

        var valorEmReal = contacaoDolar * valorEmDolar;

        System.out.printf("O valor em reais (R$) é: %.2f", valorEmReal);
    }
}
