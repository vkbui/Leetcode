class MyQueue {

    // initialize stacks
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    int front; // var that holds the first element pushed
        
    public void push(int x) {
        if (s1.isEmpty()) {
            front = x; // stores first element
        }
        s1.push(x); // pushes element to back of queue
    }
    
    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) { // moves all elements of s1 into s2 in reverse order
                s2.push(s1.pop());
            }
        }
        return s2.pop(); // pops last added element in s2 
    }
    
    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek(); // when s2 not empty, front element positioned on top of s2
        }
        return front; // else return the stored front
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */