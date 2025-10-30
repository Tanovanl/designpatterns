package creational.factorymethod;

public abstract class Dialog {
    public abstract Button createButton();

    public void renderWindow(){
        Button button = createButton();
        button.render();
    }
}

class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

class WebDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WebButton();
    }
}
