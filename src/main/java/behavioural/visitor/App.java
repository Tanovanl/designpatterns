package behavioural.visitor;

public class App {
    public static void main(String[] args) {
        Employee[] employees = { new Manager(), new Developer() };
        Visitor salaryReport = new SalaryReportVisitor();

        for (Employee emp : employees) {
            emp.accept(salaryReport);
        }
    }
}
