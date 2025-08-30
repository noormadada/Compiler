package AST;

public class ReturnStatement implements AST_Node{
    String Return ;
    Expression expression;

    public String getReturn() {
        return Return;
    }

    public void setReturn(String aReturn) {
        Return = aReturn;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
    public String toString() {
if(expression!=null) {
    return "ReturnStatement{" +
            "\n Return= " + Return +

            "\n expression= " + expression +
            "\n }";
}
      else  return "ReturnStatement{" +
        "\n Return= " + Return +
        "\n }";
           }

    }

