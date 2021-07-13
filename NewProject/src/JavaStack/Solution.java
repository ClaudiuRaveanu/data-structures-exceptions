package JavaStack;
import java.util.*;

public class Solution {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.nextLine();
            Stack<Character> st = new Stack<>();
            for (char c : input.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    st.push(c);
                    continue;
                }

                if (!st.isEmpty() && c == '}' && st.peek() == '{') {
                    st.pop();
                    continue;
                }
                if (!st.isEmpty() && c == ']' && st.peek() == '[') {
                    st.pop();
                    continue;
                }
                if (!st.isEmpty() && c == ')' && st.peek() == '(') {
                    st.pop();
                    continue;
                }

                if (c == '}' || c == ']' || c == ')') {
                    st.push(c);
                    break;
                }

                if (c == ']' || c == ')' || c == '}') {
                    st.push(c);
                    break;
                }
            }
            System.out.println(st.isEmpty());
        }
    }
}
