import java.util.*;

class Deque {
    private List<Integer> items;

    public Deque() {
        this.items = new ArrayList<>();
    }
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // Add an item to the front 
    public void addFront(int item) {
        items.add(0, item);
    }

    // Add an item to the rear 
    public void addRear(int item) {
        items.add(item);
    }

    public void display() {
        System.out.println("Deque: " + items);
    }

    public static void main(String[] args) {
        Deque obj = new Deque();
        obj.addFront(1);
        obj.addRear(2);
        obj.addFront(3);
        
        obj.display();
    }
}