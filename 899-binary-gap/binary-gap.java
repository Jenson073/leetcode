class Solution {
    public int binaryGap(int n) {
        int max=0,zeros=1;//maintain zeros count as distance
        boolean one=false;//check if there is a 1 found 
        while(n>0){
            int bit=n%2;//get last bit
            if(bit==1){//if 1
                if(one){//and it not the first 1
                    max=Math.max(max,zeros);//update max
                }
                zeros=1;//update count
                one=true;//make it true for first 1
            }
            else{//if zero
                if(one){//if first 1 is found already
                    zeros++;//increase count
                }
            }
            n/=2;
        }
        return max;
    }
}