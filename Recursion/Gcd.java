package Recursion;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        System.out.println("Enter two Numbers to find GCD : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD : "+gcd(a,b));
    }
    static int gcd(int a,int b){
        if(a<0 || b<0)
            return -1;
        if(b == 0)
            return a;
        else
            return gcd(b,a%b);
    }
}
