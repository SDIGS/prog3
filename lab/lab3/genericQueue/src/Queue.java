import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Queue<T> {
    private List<T> c;

    public Queue(List<T> q) {
        //esporrebbe c all'esterno e non garantirebbe un comportamento in accesso di tipo FIFO
        //this.c = q;
        //-------
        //implementazione per garantirlo, duplicando in private field cosi costretto a venire modificato solo con metodi di questa claase
        Class myClass = q.getClass();
        System.out.println("Queue implemented as "  + myClass.getName());
        try {
            this.c = (List<T>)myClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        Iterator it = q.iterator();
        while(it.hasNext()) {
            c.add((T)it.next());
        }
    }

    public void enqueue(T t) {
        c.add(t);
    }
    public T dequeue() {
        if (c.size() > 0) {
            return c.remove(0);
        } else {
            return null;
        }
    }

    public boolean empty() {
        return c.size() == 0;
    }

    public void print() {
        for(T t : c) {
            System.out.print(t + ", ");
        }
        System.out.println();
    }
}
