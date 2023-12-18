import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idadeEmAnos, idadeEmMeses, idadeEmdias, idadeTotalEmDias;

        System.out.println("Idade em dias");
        System.out.print("Digite os anos: ");
        idadeEmAnos = entrada.nextInt();

        System.out.print("Digite os meses: ");
        idadeEmMeses = entrada.nextInt();

        System.out.print("Digite os dias: ");
        idadeEmdias = entrada.nextInt();

        idadeTotalEmDias = idadeEmAnos * 365 + idadeEmMeses * 30 + idadeEmdias;
        System.out.println("A idade total em dias é de: " + idadeTotalEmDias);
    }
}
