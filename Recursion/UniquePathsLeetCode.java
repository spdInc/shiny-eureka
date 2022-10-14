class Solution {
    int[][] t = null;
    public int uniquePaths(int m, int n) {
        t = new int[m][n];
        //memset the matrix
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                t[i][j]=-1;
            }
        }
        return  UniquePath(m-1,n-1);
    }
    
    int UniquePath(int m,int n){
        if(m==0 || n==0){
         return  t[m][n] = 1;
        }
        if(t[m][n] != -1){
            return t[m][n];
        }
       return t[m][n] = UniquePath(m-1,n)+ UniquePath(m,n-1);
    }
}