package Serveis_i_procesos.pruebas_dia_1;

import java.util.Random;

public class matrices {

    public static void main(String[] args) {
        int[][] m = new int[4][2];
        int[][] m2 = new int[4][2];

        int[][] Matrizsuma = new int[4][2];
        Random numeros = new Random();

        for (int fila = 0; fila < 4; fila++) {

            for (int columna = 0; columna < 2; columna++) {

                m[fila][columna] = 1 + numeros.nextInt(101);
                m2[fila][columna] = 1 + numeros.nextInt(101);

                System.out.print(m[fila][columna] + "\t");
                System.out.print(m2[fila][columna] + "\t");

            }
            System.out.println();

        }

        for (int fila = 0; fila < 4; fila++) {

            for (int columna = 0; columna < 2; columna++) {

                int numero1 = m[fila][columna];
                int numero2 = m2[fila][columna];

                int suma = numero1 + numero2;

                Matrizsuma[fila][columna] = suma;

                System.out.println(Matrizsuma[fila][columna]);
            }
            System.out.println();
        }

    }
}
