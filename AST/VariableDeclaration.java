package AST;

public class VariableDeclaration implements AST_Node {
  String  ID ;
    Expression expression;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
    @Override
    public String toString() {
        return "VariableDeclaration{" +
                "\n ID= " + ID +
                "\n expression= " + expression +
                "\n }";
    }
}
