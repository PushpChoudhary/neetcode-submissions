class Solution {
    public int findMin(int[] nums) {
        int mi=nums[0];
        for (int i=1;i<nums.length-1;i++){
            if(nums[i]<nums[i-1] && nums[i]<nums[i+1])return nums[i];
        }
        int a=Math.min(mi,nums[nums.length-1]);
        return a;
    }
}
