package com.campusdual.classroom;

import java.util.Stack;

public class Exercise {
    public static Stack<String> createStack() {
   Stack<String> pila = new Stack<>();

        pila.push("Smith");
        pila.push("Montessori");
        pila.push("Peralta");
        pila.push("House");



         return pila;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()){
            String remove = stack.pop();
            System.out.println(remove);
        }
        }

    public static void main(String[] args) {
     Stack<String> cola2 =createStack();
        System.out.println(cola2);
        printAndEmptyStack(cola2);
    }



}
