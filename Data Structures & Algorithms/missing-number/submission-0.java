class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length+1;i++){
            sum+=i;
        }
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum2+=nums[i];
        }
        return sum-sum2;
    }
}
