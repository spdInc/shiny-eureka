package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter number to get Factorial : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is : "+fac(n));
    }
    static int fac(int n){
        if(n==0)
            return 1;
        else{
            return n*fac(n-1);
        }
    }
}
