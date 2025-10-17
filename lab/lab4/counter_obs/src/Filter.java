import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Filter extends Observable implements Observer {
    private List<Integer> myList;

    public Filter() {
        myList = new ArrayList<Integer>();
    }

    public List<Integer> getList() {
        return myList;
    }

    public void update(Observable o, Object arg) {
        if(arg instanceof Integer) {
            Integer c = (Integer) arg;
            myList.add(c);
            if (myList.size() % 2 == 0) {
                System.out.println("list size: " + myList.size());
            }
            setChanged();
            notifyObservers(this);
        }
    }
}