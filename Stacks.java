package pack1;

public class Stacks {
	public char pop() { 
	    int top = 0;
		if(top == -1) {
	        System.out.println("Stack is empty"); 
	        return '\0'; // devuelve un caracter nulo en caso de que la pila esté vacía
	    } else { 
	        char[] stack = null;
			char popped = stack[top]; // almacena el valor que se eliminará
	        top--; /* disminuye top */
	        return popped; /* devuelve el elemento eliminado */
	    } 
	}
	public char delete() {
	    int tail = 0;
		if (tail == 0) {
	        System.out.println("la cola esta llena");
	        return '#';
	    } else {
	        char[] queue = null;
			char element = queue[0]; // guarda el primer elemento de la cola
	        for (int i = 0; i < tail - 1; i++) {
	            queue[i] = queue[i+1]; // mueve el resto de los elementos una posición hacia adelante
	        }
	        tail--; // actualiza el índice de la posición disponible
	        return element; // devuelve el primer elemento de la cola
	    }
	}


}
