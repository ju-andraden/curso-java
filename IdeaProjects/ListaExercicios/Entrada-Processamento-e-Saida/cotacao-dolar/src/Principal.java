import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double contacaoDolar;
        double valorEmDolar;
        double valorEmReal;

        System.out.println("Digite a cotação do dólar (USD): ");
        contacaoDolar = entrada.nextDouble();

        System.out.println("Digite o valor em dólar (USD): ");
        valorEmDolar = entrada.nextDouble();

        valorEmReal = contacaoDolar * valorEmDolar;

        System.out.printf("O valor em reais (R$) é: " + valorEmReal +  "\n");
    }
}
