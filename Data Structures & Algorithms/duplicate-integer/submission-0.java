
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> number=new HashSet<>();
        for (int num :nums){
            if(number.contains(num)){
                return true;
            }
            number.add(num);
        }
        return false;
 
    }
}
