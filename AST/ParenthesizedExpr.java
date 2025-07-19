package AST;

public class ParenthesizedExpr extends Expression implements AST_Node {

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
