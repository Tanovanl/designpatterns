package behavioural.visitor;

public class Manager implements Employee{

    public String name = "Tano";
    public int baseSalary = 3000;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
