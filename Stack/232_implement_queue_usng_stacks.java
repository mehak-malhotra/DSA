class MyQueue {
    Stack <Integer> st= new Stack<>();
    Stack <Integer> helper= new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        int n= st.size();
        for(int i=0; i<n; i++){
            helper.push(st.pop());
        }

        st.push(x);

        for(int i=0; i<n; i++){
            st.push(helper.pop());
        }
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */