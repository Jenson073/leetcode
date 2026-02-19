class Solution {
    public int countBinarySubstrings(String s) {
        int prev=0,curr=1,res=0;//get a prev and curr to maintain the count of consective zeros and ones 
        for(int i=1;i<s.length();i++){//start from 1 and manage curr as 1
            if(s.charAt(i)==s.charAt(i-1)){//check if same
                curr++;//then increase the consecutive count
            }
            else{//if a change happens
                res+=Math.min(prev,curr);//check for same no of consective 1s and 0s using min and that will the no of substrings added to result
                prev=curr;//update previous consecutive
                curr=1;//update curr as 1
            }
        }
        res+=Math.min(prev,curr);//for the last set of consecutive 0s and 1s
        return res;//return substring count
    }
}