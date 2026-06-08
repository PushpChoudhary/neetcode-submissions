class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            q.add(i);
        }
        while(q.size()>1){
            int a=q.poll();
            int b=q.poll();
            int diff=a-b;
            if(diff>0) q.add(diff);
        }
        if (q.size()==0)return 0;
        return q.poll();
    }
}
