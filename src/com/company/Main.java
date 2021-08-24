package com.company;
import java.util.*;

/*This code will take an array and rotate it 90 degrees */


public class Main
{
    public static void main(String[] args)
    {
        int [][] matrixOne = {{1,2,3}, {4,5,6}, {7,8,9}};

        printMatrix(matrixOne); //print before rotating
        System.out.println("---------");
        printMatrix(rotateArray(matrixOne)); //prints the rotated array

    }

    public static int[][] rotateArray(int[][] matrix) //Turns rows into columns
    {
        int m = matrix.length;  // m x n matrix
        int n = matrix[0].length;
        int [][] newArray = new int[m][n];

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                newArray[j][m-1-i] = matrix[i][j];  //starts at the bottom left corner
            }
        }
        return newArray;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
