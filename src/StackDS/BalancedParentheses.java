package StackDS;

public class BalancedParentheses {

    static boolean isBalanced(String s) {
        CharStack st = new CharStack(s.length());

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Opening brackets → PUSH
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            // Closing brackets → POP & MATCH
            else {
                if (st.isEmpty()) {
                    return false; //  no opening for closing
                }

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }

            }
        }

        return st.isEmpty(); // Stack should be empty at end
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("()"));
        System.out.println(isBalanced("{[()]}"));
    }
}
