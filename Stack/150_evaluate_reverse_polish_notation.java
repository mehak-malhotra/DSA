class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st= new Stack <Integer>();
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+") || tokens[i].equals("-")
            || tokens[i].equals("*") || tokens[i].equals("/")){
                int num1= st.pop();
                int num2= st.pop();
                if(tokens[i].equals("+")) st.push(num2+num1);
                if(tokens[i].equals("-")) st.push(num2-num1);
                if(tokens[i].equals("*")) st.push(num2*num1);
                if(tokens[i].equals("/")) st.push(num2/num1);
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}