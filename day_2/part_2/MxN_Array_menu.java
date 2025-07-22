import java.util.Arrays;
import java.util.Scanner;

public class MxN_Array_menu {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter row size of 2D Array : ");
        int rows  = scan.nextInt();
        System.out.println("Enter column size of 2D Array : ");
        int cols  = scan.nextInt();
          
        int[][] matrix = build2dArray(rows, cols);

        menu(matrix);
        
    }

    public static void menu(int[][] matrix){

        System.out.println("---------------------------------------------------------------------");
        System.out.println("                          -------MENU------                          ");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf(" * Press (%d) to display elements of matrix of size m x n \n",1);
        System.out.printf(" * Press (%d) to Sum of all elements of matrix of size m x n \n",2);
        System.out.printf(" * Press (%d) to display row-wise sum of matrix of size m x n \n",3);
        System.out.printf(" * Press (%d) to display column-wise sum of matrix of size m x n \n",4);
        System.out.printf(" * Press (%d) to create transpose of matrix of size n x m \n",5);
        System.out.printf(" * Press (%d) to Exit ! \n",0);

        System.out.println("---------------------------------------------------------------------");

        System.out.println("Choose any Option : ");
        int option = scan.nextInt();

        switch (option) {
            case 1:
                display2dArray(matrix);
                break;
            case 2:
                System.out.println("Sum of 2D Array : "+sumOf2dArray(matrix));
                break;
            case 3:
                rowWiseSumOf2dArray(matrix);
                break;
            case 4:
                colWiseSumOf2dArray(matrix);
                break;
            case 5:
                tranpose2dArray(matrix);
                break;
            case 0:
                return;
        }
        menu(matrix);
    }
    
    public static int[][] build2dArray(int rows, int cols){ // OK
        int[][] matrix = new int[rows][cols];

        for(int i=0; i<rows; i++){
            System.out.println("Row : "+(i));
            for(int j=0; j<cols; j++){
                System.out.printf("Enter the Element for index [%d][%d] : ",i,j);
                matrix[i][j] = scan.nextInt();
            }
        }
        return matrix;
    }

    public static void display2dArray(int[][] matrix){
        System.out.println("2D Array : ");
        System.out.print("[");
        for(int i=0; i<matrix.length; i++){
            System.out.print(" [");
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.print("] ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static int sumOf2dArray(int[][] matrix){
        int sum = 0;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void rowWiseSumOf2dArray(int[][] matrix){
        
        for(int i=0; i<matrix.length; i++){
            int sum = 0;
            for(int j=0; j<matrix[0].length; j++){
                sum += matrix[i][j];
            }
            System.out.printf("Sum of '%d' row : %d \n",i,sum);
        }
        System.out.println();
    }

    public static void colWiseSumOf2dArray(int[][] matrix){
        
        for(int j=0; j<matrix[0].length; j++){
            int sum = 0;
            for(int i=0; i<matrix.length; i++){
                sum += matrix[i][j];
            }
            System.out.printf("Sum of '%d' col : %d \n",j,sum);
        }
        System.out.println();
    }

    public static int[][] tranpose2dArray(int[][] matrix){
        int[][] transpose = new int[matrix.length][matrix.length];  
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transpose of 2D Array --> "+Arrays.deepToString(transpose));
        return transpose;
    }
}



/*
 10. Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
    ● To input elements into matrix of size m x n    (@)
    ● To display elements of matrix of size m x n    (@)
    ● Sum of all elements of matrix of size m x n    (@)
    ● To display row-wise sum of matrix of size m x n
    ● To display column-wise sum of matrix of size m x n
    ● To create transpose of matrix of size n x m
 */
