package Programming_abstraction.Stack;

public class StackUsingLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    static class Stack{
        Node top;
        void push(int val){
            Node newnode = new Node(val);
            newnode.next = top;
            top = newnode;
        }

        int pop(){
            if(top == null){
                System.out.println("Stack underflow");
                return -1;
            }
            int val = top.data;
            top = top.next;
            return val;
        }

        int peek(){
            if(top == null){
                return -1;
            }
            return top.data;
        }

        void diplay(){
            Node temp = top;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        st.diplay();

        System.out.println("Popped : "+st.pop());

        st.diplay();

        System.out.println("Ele at top : "+ st.peek());
    }
}
