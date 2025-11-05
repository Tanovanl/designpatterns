package behavioural.iterator;

public class Inventory {
    private Item[] items;
    private int count;

    public Inventory(int size){
        items = new Item[size];
        count = 0;
    }

    public void addItem(Item item){
        if (count < items.length) items[count++] = item;
    }

    public Iterator<Item> createIterator() {
        return new InventoryIterator();
    }

    public Iterator<Item> createWeaponIterator(){
        return new WeaponIterator();
    }

    private class WeaponIterator implements Iterator<Item>{
        private int index = -1;
        @Override
        public boolean moveNext() {
            while (index + 1 < count) {
                index++;
                if (items[index].getType().equalsIgnoreCase("Weapon"))
                    return true;
            }
            return false;
        }

        @Override
        public Item current() {
            if (index >= 0 && index < count){
                return items[index];
            }
            throw new IllegalStateException("Invalid index");
        }

        @Override
        public void reset() {
            index = -1;
        }
    }

    private class InventoryIterator implements Iterator<Item>{

        private int index = -1;

        @Override
        public boolean moveNext() {
            if (index + 1 < count){
                index++;
                return true;
            }
            return false;
        }

        @Override
        public Item current() {
            if (index >= 0 && index < count){
                return items[index];
            }
            throw new IllegalStateException("Invalid index");
        }

        @Override
        public void reset() {
            index = -1;
        }
    }
}
