import java.util.Scanner;
import java.util.Locale;

public class CalculadoraIMCAvancada {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite seu peso: ");
    double peso = entrada.nextDouble();

    System.out.print("Digite sua altura: ");
    double altura = entrada.nextDouble();

    System.out.print("Sexo (1 para 'F' ou 2 para 'M'): ");
    char sexo = 'F';

    if (entrada.nextShort() != 1) {
      sexo = 'M';
    }

    double imc = peso / (altura * altura);

    if ((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)) {
      System.out.println("Abaixo do peso ideal.");
    } 
    else if ((sexo == 'F' && imc <= 25.8) || (sexo == 'M' && imc <= 26.4)) {
       System.out.println("No peso ideal."); 
    }
    else if ((sexo == 'F' && imc <= 27.3) || (sexo == 'M' && imc <= 27.8)) {
      System.out.println("Um pouco acima do peso ideal.");
    }
    else if ((sexo == 'F' && imc <= 32.3) || (sexo == 'M' && imc <= 31.1)) {
      System.out.println("Acima do peso ideal.");
    }
    else {
      System.out.println("Obeso.");
    }

    System.out.printf("IMC: %.2f%n", imc);
    System.out.println("Fim do programa.");
  }

}