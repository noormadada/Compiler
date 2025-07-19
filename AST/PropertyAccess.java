package AST;

public class PropertyAccess extends Expression implements AST_Node {

    Expression expression;
    String id;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PropertyAccess{" +
                "\n expression=" + expression +
                "\n , id='" + id + '\'' +
                '}';
    }
}
