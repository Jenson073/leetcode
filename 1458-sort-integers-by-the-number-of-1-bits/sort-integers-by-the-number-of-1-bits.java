class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] parr=new Integer[arr.length];//since arrays.sort wont work with primitive types for comparator
        for(int i=0;i<arr.length;i++){
            parr[i]=arr[i];
        }
        Arrays.sort(parr,(a,b)->{//with a custom comparator
            int ac=Integer.bitCount(a);
            int bc=Integer.bitCount(b);
            if(ac==bc)return a-b;//if same no choose the small 
            return ac-bc;//in ascending order
        });
        for(int i=0;i<arr.length;i++){
            arr[i]=parr[i];
        }
        return arr;
    }
}