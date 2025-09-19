// approach 1: using pair class to store min element at each node

class Pair <K, V>{
    public K first;
    public V second;

    public Pair(K first, V second){
        this.first= first;
        this.second= second;
    }
}
class MinStack {
    Stack <Pair<Integer, Integer>> st= new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new Pair<>(val, val));
        }else{
            int minEl= st.peek().second;
            if(val < minEl) minEl= val;
            st.push(new Pair<>(val, minEl));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().first;
    }
    
    public int getMin() {
        return st.peek().second;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

 // approach 2: using 2 stacks

 class MinStack {

    Stack <Integer> st= new Stack<>();
    Stack <Integer> minStack= new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()) minStack.push(val);
    }
    
    public void pop() {
        int popped= st.pop();
        if(minStack.peek() == popped) minStack.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */