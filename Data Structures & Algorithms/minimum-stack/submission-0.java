class MinStack {
    Stack<Integer> a;
    Stack<Integer> mi;
    public MinStack() {
        a=new Stack<>();
        mi=new Stack<>();
    }
    
    public void push(int val) {
        if(!mi.isEmpty()){
            mi.push(Math.min(mi.peek(),val));
            
            a.push(val);
        }else{
            mi.push(val);
            a.push(val);
        }
    }
    
    public void pop() {
        if(mi.isEmpty())return;
        mi.pop();
        a.pop();
    }
    
    public int top() {
        return a.peek();
    }
    
    public int getMin() {
        return mi.peek();
    }
}
