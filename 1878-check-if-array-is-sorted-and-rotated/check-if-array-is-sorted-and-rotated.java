class Solution {//incase of a rotated sorted array at max there will only be one position where current will be greater eg: [4,5,1,2,3] whe i is 1
    public boolean check(int[] nums) {
        int greater=0,n=nums.length;//keep a count to if there is a greater no
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n])greater++;//if the curr no is greater than the next one increase count
            if(greater>1)return false;//if greater than 1 then false
        }
        return true;
    }
}