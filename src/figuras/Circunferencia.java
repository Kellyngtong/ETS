package figuras;


public class Circunferencia {
    // En esta clase declaramos la circunferencia.
    private final double radio;
    private String color;

    public Circunferencia(double radio) {
        //Constructor con el que podemos crear instancias de la clase.
        this.radio = radio;
    }

    public void imprimir() {
        // Este método aunque actualmente no tiene uso sirve para ver las propiedades: Color, Diametro y área de la Circunferencia.
        color = "rojo";
        System.out.println("Di�metro: " + 2 * radio);
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * radio * radio;
        System.out.println(area);
    }

    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        /**
         * Compara si dos circunferencias son iguales en términos de radio, considerando la opción de decimales.
         * @param considerarDecimales indica si se deben considerar los decimales al realizar la comparación
         * @param otro la otra circunferencia a comparar
         * @return true si las circunferencias son iguales, false en caso contrario
         */
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            return radio1 == radio2;
        } else {
            return Math.abs(radio1 - radio2) < 1;
        }
    }

    public double getRadio() {
        // El método simplemente devuelve el valor del atributo radio.
        return radio;
    }

    //Eliminamos el "Setter" al ser círculo final y no necesitarlo.
}

