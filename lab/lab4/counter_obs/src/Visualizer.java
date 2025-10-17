import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Visualizer implements Observer {

    public void update(Observable o, Object arg) {
        if (arg instanceof Filter) {
            Filter f = (Filter) arg;
            List<Integer> l = f.getList();
            visualize(l);
        }
    }

    public void visualize(List<Integer> l) {
        for (Integer i : l) {
            System.out.println(i.intValue());
        }
        System.out.println();
    }
}