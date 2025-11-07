package behavioural.interpreter;

public class OrExpression implements Expression{
    private final Expression left, right;

    public OrExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret() {
        return left.interpret() || right.interpret();
    }
}
