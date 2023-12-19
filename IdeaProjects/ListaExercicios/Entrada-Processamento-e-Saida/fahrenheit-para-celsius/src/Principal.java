import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;

        var entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: \n");
        fahrenheit = entrada.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("A temperatura convertida para graus Celsius é: %.2f", celsius);
    }
}
