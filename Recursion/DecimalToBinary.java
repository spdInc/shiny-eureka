package Recursion;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Enter decimal Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Binary : "+decimalToBinary(n));
        System.out.println("Binary (inbuilt) : "+Integer.toBinaryString(n));
    }
    static int decimalToBinary(int n) {
        if(n==0)
            return 0;
        else{
            return ( (n%2)+decimalToBinary(n/2)*10 );
        }
    }
}
