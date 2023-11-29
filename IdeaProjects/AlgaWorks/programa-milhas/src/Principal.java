import br.com.algamilhas.pontuacao.Participante;

public class Principal {
    public static void main(String[] args) {

        Participante participante1 = new Participante("Ju");
        Participante participante2 = new Participante("Ju", 10);

        System.out.printf("%s tem %d pontos.%n", participante1.nome, participante1.saldoDePontos);
        System.out.printf("%s tem %d pontos.%n", participante2.nome, participante2.saldoDePontos);
    }
}
