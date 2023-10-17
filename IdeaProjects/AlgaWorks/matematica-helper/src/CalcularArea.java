public class CalcularArea {

    static final double PI = 3.14159265358979323846;
    public static double calcularAreaQuadrado(double medirLado) {
        return medirLado * medirLado;
    }

    public static double calcularAreaCirculo(double raio) {
        return raio * raio * CalcularArea.PI;
    }
}
