//Task 37:   JAVA program to find transpose of a given matrix.

import java.util.Scanner;

public class Task37_TransposeMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, j;


        System.out.print("Enter Row: ");
        int row = s.nextInt();

        System.out.print("Enter Column: ");
        int column = s.nextInt();

        int array[][] = new int[row][column];
        System.out.println("Enter the Elements inside the Matrix:");

        for(i = 0; i < row; i++) {
            for(j = 0; j < column; j++) {
                array[i][j] = s.nextInt();
            }
        }

        System.out.println("Transpose Matrix Result");
        for(i = 0; i < column; i++) {
            for(j = 0; j < row; j++)
            {
                System.out.print(array[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}
