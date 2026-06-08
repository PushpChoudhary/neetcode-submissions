class MedianFinder {
    ArrayList<Integer> a;
    public MedianFinder() {
        a=new ArrayList<Integer>();
    }
    
    public void addNum(int num) {
        a.add(num);
        
    }
    
    public double findMedian() {
        Collections.sort(a);
        if(a.size()%2==0){
            int b=a.get((a.size()/2));
            int c=a.get(((a.size()/2)-1));
            return (double)(c+b)/2;
        }
        return (double)a.get(a.size()/2);
    }
}
