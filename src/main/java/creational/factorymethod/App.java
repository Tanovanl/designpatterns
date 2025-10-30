package creational.factorymethod;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Dialog windDialog = new WindowsDialog();
        Dialog webDialog = new WebDialog();

        windDialog.renderWindow();  // uses factory method internally
        webDialog.renderWindow();
    }
}
