public class Principal {
    public static void main(String[] args) {
        Aeronave aviaoLua = new Aeronave();
        aviaoLua.totalAssentos = 100;

        aviaoLua.desativar();
        aviaoLua.ativar();

        aviaoLua.reservarAssentos(10);

        System.out.printf("LUA (%s): %d assentos disponíveis%n",
                aviaoLua.ativo ? "Ativo" : "Inativo",
                aviaoLua.calcularAssentosDisponiveis());

        Aeronave aviaoEstrela = new Aeronave();
        aviaoLua.totalAssentos = 120;

        aviaoEstrela.reservarAssentos(5);

        System.out.printf("ESTRELA (%s): %d assentos disponíveis%n",
                aviaoLua.ativo ? "Ativo" : "Inativo",
                aviaoLua.calcularAssentosDisponiveis());
    }
}
