package AST;

import java.util.ArrayList;
import java.util.List;

public class IdentifierExpr extends Expression implements AST_Node{
   List<String> id = new ArrayList<>();
   String as;
   List<Expression> expressionList= new ArrayList<>();

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }


    @Override
    public String toString() {
        if(as!=null)
        return "IdentifierExpr{" +
                "\n id=" + id +
                "\n as='" + as +
                "\n expressionList=" + " " +
                '}';
        else if (!expressionList.isEmpty())
            return "IdentifierExpr{" +
                    "\n id=" + id +
                    "\n as='" +  " " +
                    "\n expressionList=" + expressionList +
                    '}';
        else
            return "IdentifierExpr{" +
                    "\n id=" + id +
                    "\n  as='" +  " " +
                    "\n expressionList=" + " " +
                    '}';

    }
}
