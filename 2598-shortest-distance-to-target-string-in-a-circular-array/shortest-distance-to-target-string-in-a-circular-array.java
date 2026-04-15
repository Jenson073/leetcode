class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        for(int i=0;i<n;i++){//traverse the array
            String right=words[(startIndex+i)%n];//go through start index right and left side one by one 
            String left=words[(startIndex-i+n)%n];
            if(right.equals(target) || left.equals(target)){//check which reaches first
                return i;//return the distance which is the index
            }
        }
        return -1;//if not found
    }
}