package AST;

import java.util.ArrayList;
import java.util.List;

public class AssignmentStatement implements AST_Node{
    List<Expression> expression=new ArrayList<>();

    public List<Expression> getExpression() {
        return expression;
    }

    public void setExpression(List<Expression> expression) {
        this.expression = expression;
    }
    @Override
    public String toString() {

        return "AssignmentStatement{" +
                ", Expression=" + expression +
                '}';
    }
}
