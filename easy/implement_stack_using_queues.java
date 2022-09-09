class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    int top;
    
    public void push(int x) {
        q1.add(x); // adds element to end of queue
        top = x; // kept as top 
    }
    
    public int pop() { // queue is FIFO (first in - first out) data structure, the last inserted element could be removed only after all elements, except it, have been removed
        while (q1.size() > 1) { // moves all elements to q2 except last element
            top = q1.remove();
            q2.add(top);
        }
        int pop = q1.remove(); // remove last element
        Queue<Integer> temp = q1; // swap q1 and q2
        q1 = q2;
        q2 = temp;
        return pop;
    }
    
    public int top() { // return top element
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */