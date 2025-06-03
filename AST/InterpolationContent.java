package AST;

import java.util.ArrayList;
import java.util.List;

public class InterpolationContent {
    List<InterpolationExpr>interpolationExprList=new ArrayList<>();

    public List<InterpolationExpr> getInterpolationExprList() {
        return interpolationExprList;
    }

    public void setInterpolationExprList(List<InterpolationExpr> interpolationExprList) {
        this.interpolationExprList = interpolationExprList;
    }

    @Override
    public String toString() {
        return "InterpolationContent{" +
                "interpolationExprList=" + interpolationExprList +
                '}';
    }
}
