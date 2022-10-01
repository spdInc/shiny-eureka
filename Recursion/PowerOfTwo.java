package Recursion;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter value of Power : ");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        System.out.println("Ans : "+powerOfTwo(p));
    }
    static int powerOfTwo(int power){
        if(power==0)
            return 1;
        else {
            int ans = 2*powerOfTwo(power-1);
            return ans;
        }
    }
}

