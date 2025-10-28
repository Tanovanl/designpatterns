package structural.adapter;

public class PostNL {
    public double getTotal(int grams){
        return 3.95 + ((grams / 1000.0) * 1.4);
    }
}
