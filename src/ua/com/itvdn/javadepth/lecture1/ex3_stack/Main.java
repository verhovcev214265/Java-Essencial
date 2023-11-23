package ua.com.itvdn.javadepth.lecture1.ex3_stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println(
                "peek: " + stack.peek() +
                        "pop: " + stack.pop()
        );

        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }
    }
}
