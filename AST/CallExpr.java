package AST;

import java.util.ArrayList;
import java.util.List;

public class CallExpr extends Expression implements AST_Node {

    List<Expression> expressionList = new ArrayList<>();
    List<String> id=new ArrayList<>();

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
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
        if(!id.isEmpty()){
            return "CallExpr{" +
                    "expressionList=" + expressionList +
                    ", id=" + id +
                    '}';
        }else {
            return "CallExpr{" +
                    "expressionList=" + expressionList +
                    '}';
        }
    }
}
