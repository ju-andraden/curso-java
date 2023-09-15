import java.util.Scanner;
import java.util.Locale;

public class IndiceMassaCorporal {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner entrada = new Scanner(System.in);

    System.out.print("Peso: ");
    double peso = entrada.nextDouble();

    System.out.print("Altura: ");
    double altura = entrada.nextDouble();

    entrada.nextLine();

    System.out.print("Nome: ");
    String nome = entrada.nextLine();

    double imc = peso / (altura * altura);

    System.out.printf("IMC de %s: %.2f%n", nome, imc);
  }

}