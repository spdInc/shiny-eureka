package Recursion;

import java.util.Scanner;

public class Fibonacci {
    static int fib(int n){
        if(n<0)
            return -1;
        if(n==0 || n==1)
            return n;
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter nth term to get fibonacci Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The nth term is : "+fib(n));
    }
}
