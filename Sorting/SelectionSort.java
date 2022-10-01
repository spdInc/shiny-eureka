package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class selectionsort {

    public static void sort(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            int smallest =i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]= temp; 

        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = {7,8,3,2,1};

        System.out.println("Enter the elements of array");

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr);
        
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));

        
    }  

    }
    

