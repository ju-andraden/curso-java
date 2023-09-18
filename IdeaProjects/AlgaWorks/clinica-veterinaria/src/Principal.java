public class Principal {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.nome = "Estrela";
        meuCachorro.raca = "Shitzu";
        meuCachorro.sexo = 'F';
        meuCachorro.idade = 1;

        Cachorro seuCachorro = new Cachorro();
        seuCachorro.nome = "Paçoca";
        seuCachorro.raca = "SRD";
        seuCachorro.sexo = 'M';
        seuCachorro.idade = 3;

        System.out.println("-----------");
        System.out.println("Meu cachorro");
        System.out.printf("Nome: %s%n", meuCachorro.nome);
        System.out.printf("Raça: %s%n", meuCachorro.raca);
        System.out.printf("Sexo: %s%n", meuCachorro.sexo);
        System.out.printf("Idade: %d%n", meuCachorro.idade);

        System.out.println();

        System.out.println("-----------");
        System.out.println("Seu cachorro");
        System.out.printf("Nome: %s%n", seuCachorro.nome);
        System.out.printf("Raça: %s%n", seuCachorro.raca);
        System.out.printf("Sexo: %s%n", seuCachorro.sexo);
        System.out.printf("Idade: %d%n", seuCachorro.idade);
    }
}
