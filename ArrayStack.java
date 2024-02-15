public class ArrayStack implements Stack {
    private String[] myArray;
    private int top;

    public ArrayStack(int capacity) {
        myArray = new String[capacity];
        top = -1;
    }

    public void push(String e) {
        top++;
        myArray[top] = e;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    // Implementing the peek() method from the Stack interface
    public String peek() {
        if (isEmpty()) {
            // Handle the case when the stack is empty
            return null;
        }
        return myArray[top];
    }

    // Implementing the pop() method from the Stack interface
    public String pop() {
        if (isEmpty()) {
            // Handle the case when the stack is empty
            return null;
        }
        String poppedElement = myArray[top];
        top--;
        return poppedElement;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push("Hello");
        stack.push("World");
        System.out.println("Size of stack: " + stack.size());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

