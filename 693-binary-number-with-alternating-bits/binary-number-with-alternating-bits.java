class Solution {
    public boolean hasAlternatingBits(int n) {
        int bit=n%2;//get the first bit
        n=n/2;//reduce the no
        while(n>0){//go till n is 0
            int rem=n%2;//get the next bit
            if(rem!=bit){//check two bit are same or not
                bit=rem;//then change the checking bit alternatively
            }
            else{
                return false;//if same return false
            }
            n=n/2;//reduce no
        }
        return true;
    }
}