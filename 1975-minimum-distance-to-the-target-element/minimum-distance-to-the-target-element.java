class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if((start+i<n&&nums[start+i]==target)||(start-i>=0&&nums[start-i]==target)){//visit all the nos in left and right sides
                return i;//return the distance
            }
        }
        return -1;
    }
}