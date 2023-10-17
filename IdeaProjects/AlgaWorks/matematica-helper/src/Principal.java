public class Principal {
    public static void main(String[] args) {
        double areaQuadrado = CalcularArea.calcularAreaQuadrado(5.5);
        double areaCirculo = CalcularArea.calcularAreaCirculo(5.5);

        System.out.printf("Area quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Area circulo: %.2f%n", areaCirculo);
    }
}
