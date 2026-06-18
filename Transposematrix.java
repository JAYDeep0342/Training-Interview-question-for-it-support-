import java.util.Scanner;

public class Transposematrix {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number of rows and columns");
        int rows= sc.nextInt();
        int col=sc.nextInt();
        int [][] matrix= new int [rows][col];
        for(int i = 0 ;i<col;i++){
            for(int j =0;j<rows;j++){
                matrix[i][j]=sc.nextInt();
             }


        }
                System.err.println("orignal matrix");
                for(int i = 0 ;i<rows;i++){
            for(int j =0;j<col;j++){
                System.out.print (matrix[i][j]+" ");
             }
         System.out.println();
        }

        System.err.println("transpose matrix");
                for(int i = 0 ;i<rows;i++){
            for(int j =0;j<col;j++){
                System.out.print (matrix[j][i]+" ");
             }
         System.out.println();
        }
    }
}
 