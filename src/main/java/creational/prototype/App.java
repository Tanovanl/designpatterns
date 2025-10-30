package creational.prototype;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Tano", new Address("Veldegem"));

        Person pClone = person.clone();
        Person pDeepClone = person.deepClone();

        System.out.println(person);
        System.out.println(pClone);
        System.out.println(pDeepClone);

        pClone.getAddress().setCity("Madrid");
        pDeepClone.getAddress().setCity("Barcelona");

        System.out.println("-----------------------");

        System.out.println(person);
        System.out.println(pClone);
        System.out.println(pDeepClone);
    }
}
