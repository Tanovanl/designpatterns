package structural.adapter;

public class ShippingTest {
    public static void main(String[] args) {
        PostNL postNL = new PostNL();
        PostNLAdapter postNLAdapter = new PostNLAdapter(postNL);

        Bpost bpost = new Bpost();
        BpostAdapter bpostAdapter = new BpostAdapter(bpost);

        double[] weightsKg = {0.5, 2.0};

        for (double weight : weightsKg) {
            double postnlPrice = postNLAdapter.calculateShipping(weight);
            double bpostPrice = bpostAdapter.calculateShipping(weight);
            System.out.printf("Weight: %.3f kg -> PostNL: %.2f, Bpost: %.2f%n",
                    weight, postnlPrice, bpostPrice);
        }
    }
}