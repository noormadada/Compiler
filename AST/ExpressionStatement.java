package AST;

public class ExpressionStatement implements AST_Node{
    Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
    @Override
    public String toString() {

            return "ExpressionStatement{" +
                    ", Expression=" + expression +
                    '}';
        }
}
