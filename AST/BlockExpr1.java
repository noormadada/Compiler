package AST;

import java.util.ArrayList;
import java.util.List;

public class BlockExpr1 extends Block implements AST_Node {
    List<String> IdList=new ArrayList<>();
    String Number;

    public List<String> getIdList() {
        return IdList;
    }

    public void setIdList(List<String> idList) {
        IdList = idList;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    @Override
    public String toString() {
        if(Number!=null) {
            return "BlockExpr1{" +
                    "IdList=" + IdList +
                    ", Number='" + Number + '\'' +
                    '}';
        }else {
            return "BlockExpr1{" +
                    "IdList=" + IdList +
                    '}';
        }
    }
}
