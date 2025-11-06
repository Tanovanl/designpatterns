package behavioural.state;

public interface State {
    void insertCoin();
    void pressButton();
    void dispense();
}

class NoCoinState implements State {
    private VendingMachine machine;

    public NoCoinState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("💰 Coin inserted.");
        machine.setState(machine.getHasCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("Insert a coin first!");
    }

    @Override
    public void dispense() {
        System.out.println("No coin, can’t dispense.");
    }
}


class HasCoinState implements State {
    private VendingMachine machine;

    public HasCoinState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted!");
    }

    @Override
    public void pressButton() {
        System.out.println("Button pressed. Dispensing item...");
        machine.setState(machine.getDispensingState());
        machine.dispense();
    }

    @Override
    public void dispense() {
        System.out.println("Press the button first!");
    }
}


class DispensingState implements State {
    private VendingMachine machine;

    public DispensingState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Wait! Already dispensing.");
    }

    @Override
    public void pressButton() {
        System.out.println("Already dispensing your item...");
    }

    @Override
    public void dispense() {
        System.out.println("🧃 Item dispensed!");
        machine.setState(machine.getNoCoinState());
    }
}
