package structural.adapter;

public class PostNLAdapter implements ShippingProvider {
    private PostNL postNL;

    public PostNLAdapter(PostNL postNL){
        this.postNL = postNL;
    }

    @Override
    public double calculateShipping(double weight) {
        return postNL.getTotal((int) (weight * 1000));
    }
}
