public class Counter {
    private int c;
    private Filter f;

    public Counter(Filter f) {
        c = 0;
        this.f = f;
    }

    public void start() {
        for (int i=0; i<50; i++) {
            c++;
            if (c%5==0) f.filter(c);
        }
    }
}