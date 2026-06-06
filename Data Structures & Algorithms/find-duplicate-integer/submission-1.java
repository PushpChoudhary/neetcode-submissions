class Solution {
    HashSet<Integer> ha=new HashSet<>();
    public int findDuplicate(int[] nums) {
        for(int i:nums){
            if(ha.contains(i))return i;
            ha.add(i);
        }
        return -1;
    }
}
