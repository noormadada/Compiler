package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrayElement implements AST_Node {
    Expression expression;


    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
    @Override
    public String toString() {
        return "ArrayElement{" +
                "expression=" + expression +
                '}';
    }
}
