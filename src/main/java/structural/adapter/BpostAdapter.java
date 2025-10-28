package structural.adapter;

public class BpostAdapter implements ShippingProvider {
    private Bpost bpost;

    public BpostAdapter(Bpost bpost){
        this.bpost = bpost;
    }

    @Override
    public double calculateShipping(double weight) {
        return bpost.getRate(weight);
    }

}
