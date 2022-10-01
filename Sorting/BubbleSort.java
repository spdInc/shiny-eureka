package DSA;

import java.util.Scanner;

public class bubble_sort {

    public static void sort(int[] arr, int size){
        for(int i=0; i<size-1; i++){
            for(int j=0; j<size-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of array");

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr, size);

    }
    
}
