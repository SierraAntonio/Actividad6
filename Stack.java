package pack1;

public class Stack {
    private int max;
    private char[] stack;
    private int top;
    
    public Stack(int max) {
        this.max = max;
        stack = new char[max];
        top = -1;
    }
    
    public void push(char c) {
        if(top == max-1) {
            System.out.println("Stack is full");
        } else {
            top++;
            stack[top] = c;
        }
    }
    
    public char pop() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return '\0';
        } else {
            char popped = stack[top];
            top--;
            return popped;
        }
    }
    public String reverseString(String str) {
        Stack stack = new Stack(str.length());
        for(int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i)); // inserta cada carácter de la cadena en el stack
        }
        StringBuilder reversed = new StringBuilder();
        while(stack.top != -1) {
            reversed.append(stack.pop()); // saca cada carácter del stack y los agrega al StringBuilder
        }
        return reversed.toString();
    }
    public boolean isPalindrome(String str) {
        Stack stack = new Stack(str.length());
        int mid = str.length() / 2;
        for(int i = 0; i < mid; i++) {
            stack.push(str.charAt(i)); // inserta la primera mitad de la cadena en el stack
        }
        if(str.length() % 2 != 0) {
            mid++; // si la cadena es de longitud impar, salta el carácter del medio
        }
        for(int i = mid; i < str.length(); i++) {
            if(stack.pop() != str.charAt(i)) { // compara el resto de la cadena con los caracteres del stack
                return false; // si hay una diferencia, la cadena no es un palíndromo
            }
        }
        return true; // si todos los caracteres coinciden, la cadena es un palíndromo
    }


}
