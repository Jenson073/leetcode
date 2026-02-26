class Solution {
    public int numSteps(String s) {
        int steps=0,carry=0;//use a variable to get carry
        for(int i=s.length()-1;i>0;i--){//dont go to the last since we will obtain 1 atlast
            int bit=(s.charAt(i)-'0')+carry;//get the last bit value
            if(bit==1){//if 1
                steps+=2;//add two steps one for adding 1 for odd and then for dividing the even
                carry=1;//on adding we will get a carry
            }
            else{
                steps+=1;//if even just add step for dividing
            }
        }
        return steps+carry;//add the result with carry
    }
}