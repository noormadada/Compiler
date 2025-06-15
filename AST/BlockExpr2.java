package AST;

import java.util.ArrayList;
import java.util.List;

public class BlockExpr2 extends Block implements AST_Node {
List<String>IdList=new ArrayList<>();
String stringLiteral;

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public List<String> getIdList() {
        return IdList;
    }

    public void setIdList(List<String> idList) {
        IdList = idList;
    }

    @Override
    public String toString() {
        return "BlockExpr2{" +
                "IdList=" + IdList +
                ", stringLiteral='" + stringLiteral + '\'' +
                '}';
    }
}
