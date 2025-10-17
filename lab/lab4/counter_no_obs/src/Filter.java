import java.util.ArrayList;
import java.util.List;

public class Filter {
    private List<Integer> myList;
    Visualizer v;

    public Filter(Visualizer v) {
        this.v = v;
        myList = new ArrayList<Integer>();
    }

    public void filter(int c) {
        myList.add(c);
        if (myList.size()%2==0) {
            System.out.println("list size: " + myList.size());
            v.visualize(myList);
        }
    }
}