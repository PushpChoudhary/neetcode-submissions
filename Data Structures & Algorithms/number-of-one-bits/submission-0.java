class Solution {
    public int hammingWeight(int n) {
        int r=0;
        while(n!=0){
            r+=n%2;
            n=n>>1;
        }
        return r;
    }
}
