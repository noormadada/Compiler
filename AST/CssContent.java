package AST;

import java.util.ArrayList;
import java.util.List;

public class CssContent implements AST_Node {
    List<CssStatement>cssStatementList=new ArrayList<>();

    public List<CssStatement> getCssStatementList() {
        return cssStatementList;
    }

    public void setCssStatementList(List<CssStatement> cssStatementList) {
        this.cssStatementList = cssStatementList;
    }

    @Override
    public String toString() {
        if(cssStatementList.isEmpty()){
            return "CssContent{" +
                    '}';
        }else {
            return "CssContent{" +
                    "cssStatementList=" + cssStatementList +
                    '}';
        }
    }
}
