import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double tempoGasto;
        double velocidade;

        var entrada = new Scanner(System.in);

        System.out.print("Digite o tempo gasto da viagem: ");
        tempoGasto = entrada.nextDouble();

        System.out.print("Digite a velocidade média em Km/h percorrida: ");
        velocidade = entrada.nextDouble();

        var distancia = tempoGasto * velocidade;
        var listrosUsados = distancia / 12;

        System.out.println("O tempo gasto de viagem foi de: " + tempoGasto);
        System.out.println("A velocidade média percorrida foi de: " + velocidade);
        System.out.println("A distância percorrida durante a viagem foi de : " + distancia);
        System.out.printf("A quantidade de litros usados na viagem foi de: %.2f%n", listrosUsados);
    }
}
