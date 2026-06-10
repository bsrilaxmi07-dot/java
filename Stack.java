import java.util.*;
class Stack1
{
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();

        stack.push("apple");
        stack.push("mango");
        stack.push("orange");
        stack.push("banana");
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}