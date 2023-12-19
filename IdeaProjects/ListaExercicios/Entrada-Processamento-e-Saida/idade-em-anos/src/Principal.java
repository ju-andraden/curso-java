import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int idadeEmAnos;
        int idadeEmMeses;
        int idadeEmdias;

        var entrada = new Scanner(System.in);

        System.out.print("Digite os anos: ");
        idadeEmAnos = entrada.nextInt();

        System.out.print("Digite os meses: ");
        idadeEmMeses = entrada.nextInt();

        System.out.print("Digite os dias: ");
        idadeEmdias = entrada.nextInt();

        var idadeTotalEmDias = idadeEmAnos * 365 + idadeEmMeses * 30 + idadeEmdias;

        System.out.println("------------");
        System.out.println("A idade em anos é: " + idadeEmAnos);
        System.out.println("A idade em meses é: " + idadeEmMeses);
        System.out.println("A idade em dias é: " + idadeEmdias);
        System.out.println("A idade total em dias é: " + idadeTotalEmDias);
    }
}
