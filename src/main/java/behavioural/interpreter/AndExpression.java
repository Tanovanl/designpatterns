package behavioural.interpreter;

public class AndExpression implements Expression{
    private final Expression left, right;

    public AndExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret() {
        return left.interpret() && right.interpret();
    }
}
