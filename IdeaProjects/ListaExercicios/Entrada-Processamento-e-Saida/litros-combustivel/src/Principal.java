import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double tempoGasto, velocidade, distancia, listrosUsados;

        System.out.println("Digite o tempo gasto da viagem: ");
        tempoGasto = entrada.nextDouble();

        System.out.println("Digite a velocidade média em Km/h percorrida: ");
        velocidade = entrada.nextDouble();

        distancia = tempoGasto * velocidade;
        listrosUsados = distancia / 12;

        System.out.println("O tempo gasto de viagem foi de: " + tempoGasto);
        System.out.println("A velocidade média percorrida foi de: " + velocidade);
        System.out.println("A distância percorrida durante a viagem foi de : " + distancia);
        System.out.printf("A quantidade de litros usados na viagem foi de: %.2f%n", listrosUsados);

    }
}
