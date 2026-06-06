class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] an=new int[temperatures.length];
        Arrays.fill(an,0);
        for(int i=0;i<temperatures.length;i++){
            for(int j=i;j<temperatures.length;j++){
                if(temperatures[j]>temperatures[i]) 
                {
                    an[i]=j-i;
                    break;
                    }
            }
        }
        return an;
    }
}
