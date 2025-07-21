package AST;

public class ParenthesizedExpr {

    Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "ParenthesizedExpr{" +
                "expression=" + expression +
                '}';
    }
}
