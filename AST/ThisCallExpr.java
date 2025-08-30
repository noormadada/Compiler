package AST;

import java.util.ArrayList;
import java.util.List;

public class ThisCallExpr extends Expression implements AST_Node {

    String This;
    String id;
    List<Expression> expressionList = new ArrayList<>();


    public String getThis() {
        return This;
    }

    public void setThis(String aThis) {
        This = aThis;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }

    @Override
    public String toString() {
        if(expressionList.isEmpty())
            return "ThisCallExpr{" +
                    "\n This='" + This +
                    "\n id='" + id +
                    "\n expressionList=" + " " +
                    '}';
        else
            return "ThisCallExpr{" +
                    "\n This='" + This + " " +
                    "\n id='" + id + " " +
                    "\n expressionList=" + expressionList +
                    '}';
    }
}