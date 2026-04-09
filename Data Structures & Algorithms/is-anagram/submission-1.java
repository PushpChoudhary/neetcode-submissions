class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr=new int[255];
        int[] arr1=new int[255];
        for(char ch:s.toCharArray()){
            arr[ch]++;
        }
        for(char ch:t.toCharArray()){
            arr1[ch]++;
        }
        for(int i=0;i<255;i++){
            if(arr[i]!=arr1[i])return false;
        }
        return true;
    }
}
