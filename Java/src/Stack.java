
import java.util.Arrays;

public class Stack {
    String[] myArray = new String[4];
    int last = 0;
    public void push(String input){
        if (myArray.length == last ) {
            System.out.println("Stack is full");
        }
        myArray[last] = input;
        last++;
    }
    public String peek() {
        if(myArray.length==last){
            System.out.println("");
        }
        return myArray[last];
    }
    public String pop() {
        if(myArray.length==last--){
            System.out.println("");
        }

        return "";
    }

    public void display() {
        for (String data : myArray)
            System.out.print(data + "  ");
    }
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push("AIUB");
        myStack.push("NSU");
        myStack.push("IUB");
        myStack.pop();

        System.out.println(myStack.peek());
    }
}