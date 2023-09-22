public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    Pessoa proprietaria;

    void calcularValorRevenda() {
        System.out.printf("Calcular valor revenda de: %s %d%n", modelo, anoFabricacao);
    }
}