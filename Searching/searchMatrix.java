import java.util.Scanner;

public class searchMatrix {
    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the matrix");

        int row = sc.nextInt();
        int colns = sc.nextInt();

        int[][] matrix = new int[row][colns];

        System.out.println("Enter the elements of matrix");
        for(int i=0; i<row; i++){

            for(int j=0; j<colns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //System.out.println();

        System.out.println("Enter the no. to search: ");

        int x = sc.nextInt();

        for(int i=0; i<row; i++){

            for(int j=0; j<colns; j++){
                if(matrix[i][j] == x){
                    System.out.println(x +" is at ["+ i +"]"+"["+j+"]");
                }
            }
        }

    }
}
