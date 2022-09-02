import java.util.ArrayList;

public class Stack {
    /**
     * Array list to store data
     */
    private ArrayList<Integer> st;

    /**
     * Stack constructor
     */
    public Stack() {
        st = new ArrayList<Integer>();
    }

    /**
     *
     * @param iNum integer to push onto the stack
     */
    public void push(int iNum) {
        st.add(iNum);
    }

    /**
     * @return top element from the stack and deletes it
     */
    public int pop() {
        return -1;
    }

    /**
     * @return top element of the stack
     */
    public int top() {
        return -1;
    }

    public static void main() {
        Stack s = new Stack();
        s.push(1); s.push(2); s.push(3); s.push(4); s.push(5);
        System.out.println(s.top());
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.top());
        s.pop();
        s.pop();
    }
}
