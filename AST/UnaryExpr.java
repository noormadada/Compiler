package AST;

public class UnaryExpr extends Expression implements AST_Node{

    Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "UnaryExpr{" +
                "expression=" + expression +
                '}';
    }
}
