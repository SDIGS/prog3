import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class QueueApp {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(34); numbers.add(56);
        Queue<Integer> queue = new Queue<>(numbers);
        System.out.println("Is the queue empty? " + queue.empty());
        for (int i=0; i<10; i++) {
            queue.enqueue(r.nextInt(100));
        }
        queue.print();
        for (int i=0; i<10; i++) {
            if (r.nextFloat() < 0.5) {
                queue.enqueue(r.nextInt(100));
                queue.print();
            } else {
                System.out.println("Removed: " + queue.dequeue());
            }
        }
        System.out.println("\nFinal result:");
        queue.print();
        System.out.println("Is the queue empty? " + queue.empty());

        LinkedList<String> words = new LinkedList<>();
        Queue<String> queue1 = new Queue<>(words);
        queue1.enqueue("first");
        queue1.enqueue("second");
        queue1.print();
    }
}