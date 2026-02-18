class Solution {
    public boolean hasAlternatingBits(int n) {
        return (n&(n>>1))==0 && (n|(n>>2))==n;//check if right shift by 1 with and gives 0 and by 2 with or gives the same no
        //dont use left shift since it will preserve the bit like for n=5=>101 n<<1 => 1010 where n>>1 => 010
    }
}