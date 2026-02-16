class Solution {
    public int reverseBits(int n) {//treat the same way as reversing a integer
        int res=0;
        for(int i=0;i<32;i++){
            int digit=(n&1);//get the last bit
            res=res<<1;//preserve a place in res to add new bits by shifting to left by 1 and there by reversing will take place
            res=res|digit;//add the last bit to the result 
            n=n>>>1;//use unsigned right shift the ensure correct removal of bits 
        }
        return res;
    }
}