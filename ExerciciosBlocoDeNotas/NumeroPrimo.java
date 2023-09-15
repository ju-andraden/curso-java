import java.util.Scanner;

public class NumeroPrimo {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um numero positivo: ");
    int numero = entrada.nextInt();

    boolean numeroPrimo = true;

    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) {
          numeroPrimo = false;
          break;
      }
    }
        
    if (numeroPrimo && numero > 1) {
      System.out.printf("%d e um numero primo.", numero);
    }
    else {
     System.out.printf("%d nao e um numero primo.", numero);
    }

  }

}