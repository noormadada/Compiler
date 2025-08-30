package AST;

import java.util.ArrayList;
import java.util.List;

public class SpreadObjectExpr extends Expression implements AST_Node {

    List<ObjectField>objectFieldList=new ArrayList<>();
    List<SpreadField>spreadFieldList=new ArrayList<>();


    public List<ObjectField> getObjectFieldList() {
        return objectFieldList;
    }

    public void setObjectFieldList(List<ObjectField> objectFieldList) {
        this.objectFieldList = objectFieldList;
    }

    public List<SpreadField> getSpreadFieldList() {
        return spreadFieldList;
    }

    public void setSpreadFieldList(List<SpreadField> spreadFieldList) {
        this.spreadFieldList = spreadFieldList;
    }

    @Override
    public String toString() {
        if(!objectFieldList.isEmpty() && !spreadFieldList.isEmpty())
        return "  SpreadObjectExpr{" +
                "\n objectFieldList=" + objectFieldList +
                "\n  spreadFieldList=" + spreadFieldList +
                '}';
        else if (!objectFieldList.isEmpty())
            return " SpreadObjectExpr{" +
                    "\n objectFieldList=" + objectFieldList +
                    "\n  spreadFieldList=" + " " +
                    '}';
        else if (!spreadFieldList.isEmpty())
            return " SpreadObjectExpr{" +
                    "\n objectFieldList=" + " " +
                    "\n  spreadFieldList=" + spreadFieldList +
                    '}';
        else
            return " SpreadObjectExpr{" +
                    "\n objectFieldList=" + " " +
                    "\n  spreadFieldList=" + " " +
                    '}';



    }
}
