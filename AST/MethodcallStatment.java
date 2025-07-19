package AST;

import java.util.ArrayList;
import java.util.List;

public class MethodcallStatment implements AST_Node{
    List<Expression> expression=new ArrayList<>();
    String ID;


    public List<Expression> getExpression() {
        return expression;
    }

    public void setExpression(List<Expression> expression) {
        this.expression = expression;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    @Override
    public String toString() {

            return "MethodcallStatment{" +
                    ", expression=" + expression +
                    "Id='" + ID + '\'' +
                    '}';
        }
    }

