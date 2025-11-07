package behavioural.visitor;

public class SalaryReportVisitor implements Visitor{


    @Override
    public void visit(Manager manager) {
        System.out.println("Manager: " + manager.name + ", Salary: Eur" + manager.baseSalary);

    }

    @Override
    public void visit(Developer developer) {
        System.out.println("Developer: " + developer.name + ", Salary: Eur" + developer.baseSalary);
    }
}
