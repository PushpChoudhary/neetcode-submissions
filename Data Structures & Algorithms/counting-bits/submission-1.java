class Solution {
    public int[] countBits(int n) {
        int [] ar=new int[n+1];
        for(int i=0;i<=n;i++){
            ar[i]=bit(i);
        }
        return ar;
    }
    private int bit(int i){
        int r=0;
        while(i!=0){
            r+=i%2;
            i=i>>1;
        }
        return r;
    }
}
