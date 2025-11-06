package behavioural.state;

public class App {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.pressButton(); // no coin
        machine.insertCoin();  // insert
        machine.pressButton(); // dispense
        machine.insertCoin();  // again
        machine.insertCoin();  // double insert check
    }
}

