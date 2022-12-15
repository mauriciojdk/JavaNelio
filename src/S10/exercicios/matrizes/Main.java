package S10.exercicios.matrizes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("POs");
        int t = sc.nextInt();

        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                if (mat[i][j] == t){
                    System.out.println("Posição " + i + "; " + j);
                    if (mat[i][(j-1)] != -1) {
                        System.out.println("Left: " + mat[i][(j-1)]);
                    }
                    if (mat[i][(j+1)] != -1) {
                        System.out.println("Right: " + mat[i][(j+1)]);
                    }
                    if (mat[(i+1)][j] != -1) {
                        System.out.println("Down: " + mat[(i+1)][j]);
                    }
                    if (mat[(i-1)][j] != -1) {
                        System.out.println("Left: " + mat[(i-1)][j]);
                    }
                }
            }
        }
        sc.close();
    }
}

