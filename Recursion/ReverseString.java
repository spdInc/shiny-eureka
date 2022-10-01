package Recursion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        System.out.println("Reversed String is : "+reversed(str));
    }
    static String reversed(String str){
        if(str.isEmpty())
            return str;
        else
            return reversed(str.substring(1))+str.charAt(0);
    }
}
