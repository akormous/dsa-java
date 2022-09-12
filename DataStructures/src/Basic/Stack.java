package Basic;

import java.util.ArrayList;
import java.util.Collections;

public class Stack {
    private ArrayList<Integer> st;  // array list to store data
    private int topIdx;    // index of the top of the stack
    /**
     * Basic.Stack constructor
     */
    public Stack(int iSize) {
        st = new ArrayList<Integer>(Collections.nCopies(iSize, -1));
        topIdx = -1;
    }

    /**
     *
     * @param iNum integer to push onto the stack
     */
    public void push(int iNum) {
        if(topIdx == st.size()) {
            throw new StackOverflowError();
        }
        topIdx += 1;
        st.set(topIdx, iNum);
    }

    /**
     * @return top element from the stack and deletes it
     */
    public int pop() {
        if(topIdx == -1) {
            throw new StackOverflowError("Basic.Stack Underflow!");
        }
        int tmp = st.get(topIdx);
        topIdx -= 1;
        return tmp;
    }

    /**
     * @return top element of the stack
     */
    public int top() {
        return st.get(topIdx);
    }

    public boolean empty() {
        return topIdx == -1;
    }

    public static void main(String[] args) {
        Stack s = new Stack(10);
        for(int i = 0; i < 10; i++) {
            try {
                s.push(i*10);
            }
            catch(Exception e) {
                System.out.println("Exception occurred while pushing data to stack\n" + e.getMessage());
            }
        }
        System.out.println("hello" + s.top());
        while(!s.empty()) {
            System.out.println(s.pop());
        }
    }
}
