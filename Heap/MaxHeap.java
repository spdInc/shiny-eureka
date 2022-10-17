package Heap;

import javax.print.attribute.Size2DSyntax;
import javax.print.attribute.standard.Sides;

public class MaxHeap {

    int[] arr;
    int size;
    //constructor
    MaxHeap(){
        arr = new int[20];
        size = 0;
    }
    //Insertion of Maximum Heap
    public void insertHeap(int val){
        size = size+1;
        int index = size;
        arr[index]  =val;

        while(index>1){
            int parent = index/2;

            if(arr[parent]<arr[index]){
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;

                index = parent;
            }else{
                return;
            }
        }
    }

    // Deletion from Maxheap

    public void delete(){
        if(size==0){
            System.out.println("Heap is Empty");
        }
        arr[1] = arr[size];
        size--;
        int index = 1;
        while(index<size){
            int leftIndex = 2*index;
            int rightIndex = 2*index+1;

            if(leftIndex<size && arr[index]<arr[leftIndex]){
                int temp = arr[leftIndex];
                arr[leftIndex] = arr[index];
                arr[index] = temp;
                index = leftIndex;
                
            }
            else if(rightIndex<size && arr[index]<arr[rightIndex]){
                int temp = arr[rightIndex];
                arr[rightIndex] = arr[index];
                arr[index] = temp;
                index = rightIndex;
            }else{
                return;
            }
        }    
    }
// Print Heap
    public void print(){
        for(int i=1;i<=size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Max heapify

    public static void maxHeapify(int[] arr,int n,int i){
        int largest = i;
        int left = 2*i;
        int right = 2*i+1;
        
        if(left<n && arr[largest]<arr[left]){
            largest = left;
        }
        if(right<n && arr[largest]<arr[right]){
            largest = right;
        }
        if(largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            maxHeapify(arr, n, largest);
        }
    }

    // Heap sort
    public static void heapSort(int[] arr,int n){
        int size = n;
        while(size>1){
            int temp = arr[1];
            arr[1] = arr[size-1];
            arr[size-1] = temp;
            size--;
            maxHeapify(arr, size, 1);
            
        }
    }
    public static void main(String[] args) {
        MaxHeap h = new MaxHeap();
        h.insertHeap(5);
        h.insertHeap(7);
        h.insertHeap(1);
        h.insertHeap(9);
        h.insertHeap(3);

        h.print();
        System.out.println();
        //h.delete();
        //h.print();

        int[] arr  = {-1,4,5,7,1,0};
        int n = 5;
        for(int i=n/2;i>0;i--){
            maxHeapify(arr, n, i);
        }
        for(int a=1;a<arr.length;a++){
            System.out.print(arr[a]+" ");
        }
        System.out.println();
        heapSort(arr, n);
        for(int a=1;a<arr.length;a++){
            System.out.print(arr[a]+" ");
        }
    }
}
