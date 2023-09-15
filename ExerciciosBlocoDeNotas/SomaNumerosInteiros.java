import java.util.Scanner;

public class SomaNumerosInteiros {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int somaNumeros = 0;

    while (somaNumeros < 100) {
      System.out.print("Digite um numero: ");
      int numero = entrada.nextInt();

      somaNumeros += numero;
    }

    System.out.printf("Soma dos numeros: %d%n", somaNumeros);
  }

}