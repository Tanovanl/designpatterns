// java
package creational.prototype;

public class Person implements Cloneable {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone(); // shallow: shares Address
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Person deepClone(){
        return new Person(this.name, new Address(this.address.getCity()));
    }

    @Override
    public String toString() {
        return name + " @ " + address;
    }
}