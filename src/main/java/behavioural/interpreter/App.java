package behavioural.interpreter;

public class App {
    public static void main(String[] args) {
        Expression trueConst = new Constant(true);
        Expression falseConst = new Constant(false);

        Expression andExpr = new AndExpression(trueConst, falseConst);
        Expression orExpr = new OrExpression(trueConst, falseConst);

        System.out.println("true AND false = " + andExpr.interpret()); // false
        System.out.println("true OR false = " + orExpr.interpret());   // true
    }
}
