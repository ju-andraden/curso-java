import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.println("Digite a temperatura em graus Celsius: \n");
        celsius = entrada.nextDouble();

        fahrenheit = (9 * celsius + 160) / 5;

        System.out.printf("A temperatura convertida para graus Fahrenheit é: %.2f%n", fahrenheit);
    }
}
