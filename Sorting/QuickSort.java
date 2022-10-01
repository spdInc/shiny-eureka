package DSA;

import java.util.Arrays;

public class quickSort {

    public static int partition(int arr[], int low , int high){

        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //now the original index of pivot is i;(in sorted array the actual position of pivot is i)



    }

    public static void quick_Sort(int arr[], int low, int high){
        
        if(low<high){
            int pivIdx = partition(arr, low, high);

            quick_Sort(arr, low, pivIdx-1);
            quick_Sort(arr, pivIdx+1, high);

        }

        
    }

    public static void main(String agrs[]){
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;

        quick_Sort(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));
    }
    
}
