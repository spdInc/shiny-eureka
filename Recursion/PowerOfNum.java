package Recursion;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        System.out.println("Enter Base and Exponent : ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();
        System.out.println("ANS : "+powerOfNum(base,exp));
    }
    static float powerOfNum(int base,int exp){
        if(exp==0 || exp==1)
            return base;
        else if(exp>0)
            return base*powerOfNum(base,exp-1);
        else
            return 1/(base*powerOfNum(base,-exp-1));
    }
}
