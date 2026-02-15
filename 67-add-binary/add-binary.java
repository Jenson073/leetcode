class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res=new StringBuilder();//get a result
        int i=a.length()-1,j=b.length()-1,carry=0;//maintain the index of bits and carry no
        while(i>=0||j>=0||carry==1){//if there is any bit or carry exists
            int sum=0;//get the current bit sum
            if(i>=0)sum+=a.charAt(i--)-'0';//get the 'a' bit value in integer
            if(j>=0)sum+=b.charAt(j--)-'0';//get the 'b' bit value in integer
            sum+=carry;//add carry value also
            res.append(sum%2);//add the bit value to result and get mod to achieve bit addition
            carry=sum/2;//get the carry value using division
        }
        return res.reverse().toString();//reverse the result to preserve the order of bits
    }
}