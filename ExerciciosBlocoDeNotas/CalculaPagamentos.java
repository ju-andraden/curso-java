import java.util.Scanner;
import java.util.Locale;

public class CalculaPagamentos {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner entrada = new Scanner(System.in);

    System.out.print("Nome: ");
    String nome = entrada.nextLine();

    System.out.print("Valor por Hora: ");
    double valorHora = entrada.nextDouble();

    System.out.print("Horas trabalhadas: ");
    int horasTrabalhadas = entrada.nextInt();

    System.out.print("Valor dos Descontos: ");
    double valorDescontos = entrada.nextDouble();

    double valorTrabalhado = valorHora * horasTrabalhadas;
    double valorTotalDevido = valorTrabalhado - valorDescontos;

    System.out.printf("%nFolha de Pagamento: %s%n", nome);
    System.out.printf("%d horas x R$%.2f = R$%.2f%n", 
       horasTrabalhadas, valorHora, valorTrabalhado);
    System.out.printf("Descontos: R$%.2f%n", valorDescontos);
    System.out.printf("Total devido: R$%.2f%n", valorTotalDevido);
  }

}


    
