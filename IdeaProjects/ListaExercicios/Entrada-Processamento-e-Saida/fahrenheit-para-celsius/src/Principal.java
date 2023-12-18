import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double fahrenheit;
        double celsius;

        System.out.println("Digite a temperatura em graus Fahrenheit: \n");
        fahrenheit = entrada.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("A temperatura convertida para graus Celsius é: %.2f%n", celsius);
    }
}
