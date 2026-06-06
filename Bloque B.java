package taller10;
public class p2 {
    

    public static void main(String[] args) {

        int[][] v = {
            {12, 8, 15, 10, 20}, 
            {5, 7, 6, 9, 4},     
            {18, 14, 11, 16, 22} 
        };

        String[] p = {"Arroz", "Panela", "Cafe"};

        int[] tp = new int[3];

        for (int i = 0; i < v.length; i++) {
            int sf = 0;

            for (int j = 0; j < v[i].length; j++) {
                sf += v[i][j];
            }

            tp[i] = sf;
        }

        System.out.println("TOTAL POR PRODUCTO");
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i] + ": " + tp[i]);
        }
        System.out.println("TOTAL POR DIA");

        String[] dias = {"Lun", "Mar", "Mie", "Jue", "Vie"};

        for (int j = 0; j < v[0].length; j++) {
            int sc = 0;

            for (int i = 0; i < v.length; i++) {
                sc += v[i][j];
            }

            System.out.println(dias[j] + ": " + sc);
        }
        int tg = 0;

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                tg += v[i][j];
            }
        }

        System.out.println("TOTAL GENERAL: " + tg);

        int mayor = tp[0];
        int posicionMayor = 0;

        for (int i = 1; i < tp.length; i++) {
            if (tp[i] > mayor) {
                mayor = tp[i];
                posicionMayor = i;
            }
        }

        System.out.println("PRODUCTO MAS VENDIDO:");
        System.out.println(p[posicionMayor] + " con " + mayor + " unidades.");
    }
    
}
