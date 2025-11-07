package behavioural.visitor;

public class Developer implements Employee{
    public String name = "TanoDEv";
    public int baseSalary = 2000;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
