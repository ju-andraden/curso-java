public class CalculadoraImc {

    IndiceMassaCorporal calcular(double altura, double peso) {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }
}
