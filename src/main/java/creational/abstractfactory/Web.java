package creational.abstractfactory;

class WebFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WebButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WebCheckbox();
    }
}

class WebButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering webbutton");
    }
}

class WebCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering webcheckbox");
    }
}
