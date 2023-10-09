public class Principal {

    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
        double altura = 1.62;
        double peso = 71.5;

        IndiceMassaCorporal imc = calculadoraImc.calcular(altura, peso);

        if (imc.estaComObesidade()) {
        System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
                "precisa focar mais na saúde.%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
