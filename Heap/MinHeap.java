package Heap;

public class MinHeap {
    int[] arr;
    int size;
    //constructor
    MinHeap(){
        arr = new int[20];
        size = 0;
    }

    //Insertion of Minimum Heap
    public void insertHeap(int val){
        size = size+1;
        int index = size;
        arr[index]  =val;

        while(index>1){
            int parent = index/2;

            if(arr[parent]>arr[index]){
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;

                index = parent;
            }else{
                return;
            }
        }
    }

    // Deletion from Minheap

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

            if(leftIndex<size && arr[index]>arr[leftIndex]){
                int temp = arr[leftIndex];
                arr[leftIndex] = arr[index];
                arr[index] = temp;
                index = leftIndex;
                
            }
            else if(rightIndex<size && arr[index]>arr[rightIndex]){
                int temp = arr[rightIndex];
                arr[rightIndex] = arr[index];
                arr[index] = temp;
                index = rightIndex;
            }else{
                return;
            }
        }    
    }

    public void print(){
        for(int i=1;i<=size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        MinHeap h = new MinHeap();

        h.insertHeap(5);
        h.insertHeap(7);
        h.insertHeap(1);
        h.insertHeap(9);
        h.insertHeap(3);

        h.print();
        System.out.println();
        h.delete();
        h.print();
    }
}
