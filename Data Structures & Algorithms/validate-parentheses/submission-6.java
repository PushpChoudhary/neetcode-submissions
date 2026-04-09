class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int len=s.length();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else {
                if (st.isEmpty()) {
                    return false;
                }

                // Pop the top element and check for a mismatch.
                char top = st.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}
