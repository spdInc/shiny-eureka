import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort{

    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = {7,8,3,2,1};  //Demo array

        System.out.println("Enter the elements of array");

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);
        
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));

        
    }  

    }
    
