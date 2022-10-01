package Recursion;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter array elements : ");
        int[] Dhiraj = new int[n];
        for(int i=0;i<n;i++)
            Dhiraj[i] = sc.nextInt();

        System.out.println("Product of Array elements : "+productOfArray(Dhiraj,n));
    }
    static int productOfArray(int[] a,int index){
        if(index<=0)
            return 1;
        else
            return a[index-1]*productOfArray(a,index-1);
    }
}
