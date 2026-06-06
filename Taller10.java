package taller10;
public class Taller10 {  
    public static void main(String[] args) {
        int[][] m= {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        int suma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma += m[i][j];
            }
        }

        System.out.println("Suma total: " + suma);
        System.out.println("Diagonal principal:");

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (fila == columna) {
                    System.out.println(m[fila][columna]);
                }
            }
        }
    }
}
