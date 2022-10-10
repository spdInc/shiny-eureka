import java.util.Scanner;

public class practice5 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        StringBuffer bufferStr = new StringBuffer(A);
        
        bufferStr.reverse();
        
        String newStr = bufferStr.toString();
        System.out.println(newStr);
        
        if(A.equals(newStr)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
