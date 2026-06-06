package taller10;
public class p1 {
     public static void main(String[] args) {
        int[] edades = {18, 22, 19, 25, 21};

        int mayor = edades[0];
        int menor = edades[0];
        int contador = 0;
        int suma = 0;

        for (int i = 0; i < edades.length; i++) {

            if (edades[i] > mayor) {
                mayor = edades[i];
            }

            if (edades[i] < menor) {
                menor = edades[i];
            }

            if (edades[i] >= 21) {
                contador++;
            }

            suma += edades[i];
        }

        double promedio = (double) suma / edades.length;

        System.out.println("Edad mayor: " + mayor);
        System.out.println("Edad menor: " + menor);
        System.out.println("Mayores o iguales a 21: " + contador);
        System.out.printf("Promedio: %.2f%n", promedio);
    }

    
}
