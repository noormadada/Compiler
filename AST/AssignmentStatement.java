package AST;

import java.util.ArrayList;
import java.util.List;

public class AssignmentStatement implements AST_Node{
    List<Expression> expression=new ArrayList<>();
    List<String> id=new ArrayList<>();

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }


    public List<Expression> getExpression() {
        return expression;
    }

    public void setExpression(List<Expression> expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        if(!id.isEmpty()){
            return "AssignmentStatement{" +
                    "expression=" + expression +
                    ", id=" + id +
                    '}';
        }else {
            return "AssignmentStatement{" +
                    "expression=" + expression +
                    '}';
        }
    }
}
