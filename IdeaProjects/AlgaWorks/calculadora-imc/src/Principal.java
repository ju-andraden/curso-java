public class Principal {

    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.altura = 1.62;
        paciente.peso = 71.5;

        IndiceMassaCorporal imc = paciente.calcularIndicieMassaCorporal();

        if (imc.resultado >= 30) {
        System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
                "precisa focar mais na saúde.%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
