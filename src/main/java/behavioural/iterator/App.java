package behavioural.iterator;

public class App {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(5);
        inventory.addItem(new Item("Sword", "Weapon"));
        inventory.addItem(new Item("Sword2", "Weapon"));
        inventory.addItem(new Item("Bread", "Food"));
        inventory.addItem(new Item("Sword3", "Weapon"));

        Iterator<Item> iterator = inventory.createIterator();
        Iterator<Item> weaponIterator = inventory.createWeaponIterator();
        Iterator<Item> foodIterator = inventory.createTypeIterator("Food");

        System.out.println("------Iterate over everything-----");
        while (iterator.moveNext()){
            Item current = iterator.current();
            System.out.println(current.getName());
        }


        System.out.println("------Iterate over Weapons-----");
        while (weaponIterator.moveNext()){
            Item current = weaponIterator.current();
            System.out.println(current.getName());
        }

        System.out.println("------Iterate over food-----");
        while (foodIterator.moveNext()){
            Item current = foodIterator.current();
            System.out.println(current.getName());
        }
    }
}
