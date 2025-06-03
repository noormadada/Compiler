package AST;

import java.util.ArrayList;
import java.util.List;

public class BlockExpr3 extends Block{
    List<String> idList=new ArrayList<>();

    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    @Override
    public String toString() {
        return "BlockExpr3{" +
                "idList=" + idList +
                '}';
    }
}
