class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length,n=mat[0].length;
        k=k%n;//reduce the checking to mod times since it will be same
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i%2==0&& mat[i][j]!=mat[i][(j-k+n)%n]){//check the value in a postion and the value in that position after k shifts 
                    return false;//if not equal then false 
                }
                if(i%2!=0&& mat[i][j]!=mat[i][(j+k)%n]){
                    return false;
                }
            }
        }
        return true;//if everything is true
    }
}