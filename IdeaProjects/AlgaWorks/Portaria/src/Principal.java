public class Principal {
    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "Ju";
        novoVisitante.idade = 17;

        if (novoVisitante.possuiAcessoRestritoPorIdade()) {
            System.out.printf("Acesso não permitido para menores de %d anos.",
                    Visitante.IDADE_MINIMA_ACESSO);
        }
        else {
            System.out.println("Acesso liberado.");
        }
    }
}
