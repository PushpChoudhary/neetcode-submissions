class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int [] arra=new int[26];
        for (int i=0;i<s.length();i++){
        arra[s.charAt(i) - 'a']++;
        arra[t.charAt(i) - 'a']--;
        }
        for (int num:arra){
            if (num!=0){
                return false;
            }

        }
        return true;
    }
}
