package lv2_oop.stack;

import lv2_oop.konto.Konto;

public class StackDemoApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(new String[10]);

        stack.push("first");
        stack.push("second");
        stack.push("third");

        System.out.println("stack.pull() = " + stack.pull());
        System.out.println("stack.pull() = " + stack.pull());
        System.out.println("stack.pull() = " + stack.pull());
        
        Stack<Konto> kontoStack = new Stack<>(new Konto[1000]);
        kontoStack.push(new Konto("Max"));
        kontoStack.push(new Konto("Susi"));
        kontoStack.pull();
        System.out.println("kontoStack.pull() = " + kontoStack.pull());
    }
}
