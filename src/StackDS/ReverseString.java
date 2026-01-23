package StackDS;

public class ReverseString {


    public static void main(String[] args) {
        String str = "Ravi";
        CharStack st = new CharStack(str.length());

        // insert char
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        String reverse = "";

        while (!st.isEmpty()) {
            reverse += st.pop();
        }

        System.out.println(reverse);
    }

}
