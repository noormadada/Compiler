package AST;

import java.util.ArrayList;
import java.util.List;

public class CallExpr extends Expression implements AST_Node {

    List<Expression> expressionList = new ArrayList<>();

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }


}
