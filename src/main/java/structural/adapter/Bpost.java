package structural.adapter;

public class Bpost {
    public double getRate(Double kilograms){
        return 5.0 + (kilograms * 1.25);
    }
}
