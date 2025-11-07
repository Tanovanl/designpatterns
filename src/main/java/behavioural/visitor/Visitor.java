package behavioural.visitor;

public interface Visitor {
    void visit(Manager manager);
    void visit(Developer developer);
}
