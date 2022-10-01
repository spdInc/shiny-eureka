public class palindromicNumber {
  
  public static void main(String args[]){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            for(int j=2; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
