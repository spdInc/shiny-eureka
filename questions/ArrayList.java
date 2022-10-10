package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class dsa {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Arrya");

        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of array");
       
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the postion:");

        int pos = sc.nextInt();


        arr = deletElement(arr, pos);

        System.out.println("New Array"+ Arrays.toString(arr));
        
    }


    public static int[] deletElement(int[] arr, int pos){

        if(arr == null || pos<0 || pos>arr.length){
            System.out.println("Invalid Entry");
        }

        int[] newArr = new int[arr.length -1];

        for (int i = 0, k = 0; i < arr.length; i++) {
            
            if (i == pos) {
                continue;
            }
 
            newArr[k++] = arr[i];
        }

        return newArr;
    }
    
}
