package Recursion;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome : ");
        String str = sc.nextLine();

//        String reversedString = isPalindrome(str);
//        System.out.println("Is String Palindrome : "+str.equals(reversedString));
        System.out.println("Is String Palindrome : "+isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        if(str.length()==0 || str.length()==1)
            return true;
        if(str.charAt(0)==str.charAt(str.length()-1))
            return isPalindrome(str.substring(1,str.length()-1));
        return false;
    }

//    static String isPalindrome( String str){
//        if(str.isEmpty())
//            return str;
//
//        return isPalindrome(str.substring(1))+str.charAt(0);
//    }


}

