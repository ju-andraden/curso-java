import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int primeiroNumero;
        int segundoNumero;

        var entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        primeiroNumero = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        segundoNumero = entrada.nextInt();

        boolean resultadoIgual = primeiroNumero == segundoNumero;
        boolean naoIgual = primeiroNumero != segundoNumero;
        boolean maior = primeiroNumero > segundoNumero;
        boolean menor = primeiroNumero < segundoNumero;
        boolean maiorOuIgual = primeiroNumero >= segundoNumero;
        boolean menorOuIgual = primeiroNumero <= segundoNumero;

        System.out.println("O primeiro número é igual ao segundo número? " + resultadoIgual);
        System.out.println("O primeiro número não é igual ao segundo número? " + naoIgual);
        System.out.println("O primeiro número é maior que o segundo número? " + maior);
        System.out.println("O primeiro número é menor que o segundo número? " + menor);
        System.out.println("O primeiro número é maior ou igual ao segundo número? " + maiorOuIgual);
        System.out.println("O primeiro número é menor ou igual ao segundo número? " + menorOuIgual);
    }
}
