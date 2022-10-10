import java.util.Scanner;

public class practice {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int res = 0;
            
            for(int j=0; j<n; j++){
                res += Math.pow(2,j)*b;
                System.out.print(a+res+" ");
            }
            System.out.println();
        }
        in.close();
        
    }
}
