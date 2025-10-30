package creational.abstractfactory;

class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering windows button");
    }
}

class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering checkbox");
    }
}