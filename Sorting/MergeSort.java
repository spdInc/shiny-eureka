package DSA;

import java.util.Arrays;

public class mergeSort {

    //Time complexity will be nlogn

    public static void conquer(int arr[], int si, int ei, int mid){
        int merged[]  = new int[ei-si+1];

        int idx1 = si; //tracking kar raha hai first arrray ko
        int idx2 = mid+1; // track kar raha hai second array ko

        int x =0; //track kar raha hai merged array ko.

        while(idx1 <= mid && idx2 <=ei){
            if(arr[idx1]<= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1<=mid){
            merged[x++] = arr[idx1++];
        }

        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }

        for(int i=0, j=si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }

    }

    public static void divide(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }

        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, ei, mid);
    }

    public static void main(String args[]){

        int arr[] = {6,3,9,5,2,8};

        int n=arr.length;

        divide(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));


    }
    
}
