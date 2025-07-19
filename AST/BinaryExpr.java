package AST;

import java.util.ArrayList;
import java.util.List;

public class BinaryExpr extends Expression implements AST_Node {

    List<Expression>expressionList = new ArrayList<>();

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }

    @Override
    public String toString() {
        return "BinaryExpr{" +
                "expressionList=" + expressionList +
                '}';
    }
}
