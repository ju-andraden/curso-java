public class Paciente {

    double peso;
    double altura;

    IndiceMassaCorporal calcularIndicieMassaCorporal() {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }
}
