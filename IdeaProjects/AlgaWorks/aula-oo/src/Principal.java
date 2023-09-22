public class Principal {

    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Juliana";
        eu.cpf = "123.456.789.01";
        eu.anoNascimento = 1999;

        Pessoa voce = new Pessoa();
        voce.nome = "Ju";
        voce.cpf = "987.654.321-09";
        voce.anoNascimento = 1998;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Azul";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.proprietaria = eu;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.proprietaria = voce;

        meuCarro.calcularValorRevenda();
        seuCarro.calcularValorRevenda();

//        System.out.println("---------");
//        System.out.println("Meu carro");
//        System.out.printf("Modelo: %s%n", meuCarro.modelo);
//        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
//        System.out.printf("Proprietária: %s%n", meuCarro.proprietaria.nome);
//
//        System.out.println();
//
//        System.out.println("---------");
//        System.out.println("Seu carro");
//        System.out.printf("Modelo: %s%n", seuCarro.modelo);
//        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
//        System.out.printf("Proprietária: %s%n", seuCarro.proprietaria.nome);
    }
}