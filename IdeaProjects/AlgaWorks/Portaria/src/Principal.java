public class Principal {
    public static void main(String[] args) {
        var novoVisitante = new Visitante();
        novoVisitante.nome = "Ju";
        novoVisitante.idade = 17;

        var cadastroPortaria = new CadastroPortaria();
        int codigoVistiante = cadastroPortaria.cadastrar(novoVisitante, 2);
    }
}

