import java.util.Scanner;

public class DigitosInvertidos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numeroOriginal = entrada.nextInt();

        int numeroPendenteInversao = numeroOriginal;
        int numeroInvertido = 0;

        while (numeroPendenteInversao > 0) {
            int resto = numeroPendenteInversao % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            numeroPendenteInversao /= 10;
        }

        System.out.println("Inverso de " + numeroOriginal + " é " + numeroInvertido);
    }

}