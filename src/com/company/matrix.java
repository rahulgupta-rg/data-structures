package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class matrix {

    public static void main(String[] args) {


       /* try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {*/
           /* int t = reader.read();
            while (t-- > 0) {
                int r = reader.read();
                int c = reader.read();
                int[][] mat1 = new int[r][c];
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        mat1[i][j] = reader.read();
                    }
                }
                int r2 = reader.read();
                int c2 = reader.read();
                int[][] mat2 = new int[r][c];
                for (int i = 0; i < r2; i++) {
                    for (int j = 0; j < c2; j++) {
                        mat2[i][j] = reader.read();
                    }
                }*/
                int[][] mat3 = {{1,2,3},{4,5,6},{7,8,9}};
                int[][] mat4 = {{4,2,1},{9,3,2},{5,8,1}};
                printMatrixSum(mat3, mat4);
            /*}
        } *//*catch (Exception e) {
            e.printStackTrace();
        }*/
    }

    static void printMatrixSum(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < mat1.length; i++) {
                if (mat1[i].length != mat2[i].length) {
                    System.out.println("-1");
                    break;
                }
                for (int j = 0; j < mat1[i].length; j++) {
                    mat1[i][j] += mat2[i][j];
                    System.out.print(mat1[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
