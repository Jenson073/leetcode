class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res=new ArrayList<>();
        if(turnedOn==0){//if 0 bits
            res.add("0:00");
            return res;
        }
        if(turnedOn>8){//if greater than 8 bits are 1 then no possible 12hour time available
            return res;
        }
        for(int i=0;i<12;i++){//go through all hours
            for(int j=0;j<60;j++){//through all minutes
                if(Integer.bitCount(i)+Integer.bitCount(j)==turnedOn){//check if the bit count of the time is same
                    res.add(i+":"+(j>9?"":"0")+j);//if yes then add the time in format
                }
            }
        }
        return res;
    }
}