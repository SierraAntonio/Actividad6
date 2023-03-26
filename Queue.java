package pack1;

public class Queue {
    private int max;
    private char[] queue;
    private int tail;
    
    public Queue(int max) {
        this.max = max;
        queue = new char[max];
        tail = -1;
    }
    
    public void insert(char c) {
        if(tail == max-1) {
            System.out.println("Queue is full");
        } else {
            tail++;
            queue[tail] = c;
        }
    }
    
    public char delete() {
        if(tail == -1) {
            System.out.println("Queue is empty");
            return '#';
        } else {
            char deleted = queue[0];
            for(int i = 0; i < tail; i++) {
                queue[i] = queue[i+1];
            }
            tail--;
            return deleted;
        }
    }
}
