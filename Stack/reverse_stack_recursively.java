package Stack;
import java.util.Stack;

class Solution {
    static void helper(Stack <Integer> st){
        if(st.isEmpty()) return;
        
        int lastEl= st.pop();
        helper(st);
        pushAtBottom(st, lastEl);
    }
    
    static void pushAtBottom(Stack <Integer> st, int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        
        int popped= st.pop();
        pushAtBottom(st, ele);
        st.push(popped);
    }
    
    static void reverse(Stack<Integer> st) {
        helper(st);
    }
}