package figuras;
/**
 * El método c2.esIgual se utiliza para comparar si dos circunferencias son iguales.
 * En este código, se crean tres instancias de la clase Circunferencia: c1, c2 y c3,
 * con diferentes valores de radio. Luego, utilizamos el método esIgual en c2 para
 * compararlo con c3 de dos formas:
 * - Sin considerar decimales: el método devuelve verdadero si los radios son exactamente iguales.
 * - Considerando decimales: el método devuelve verdadero si la diferencia entre los radios es menor a 1.
 * Si las comparaciones son verdaderas, se imprime un mensaje indicando que las circunferencias son iguales
 * en el if correspondiente.
 **/

public class Test {

    public static void main(String[] args) {

        Circunferencia c1 = new Circunferencia(5.5);
        Circunferencia c2 = new Circunferencia(10.1);
        Circunferencia c3 = new Circunferencia(10.9);

        if (c2.esIgual(false, c3))
            System.out.println("c2 y c3: iguales sin considerar decimales");

        if (c2.esIgual(true, c3))
            System.out.println("c2 y c3: iguales considerando decimales");
    }

}
