import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;

        var entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: \n");
        celsius = entrada.nextDouble();

        fahrenheit = (9 * celsius + 160) / 5;

        System.out.printf("A temperatura convertida para graus Fahrenheit é: %.2f", fahrenheit);
    }
}
