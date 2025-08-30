package AST;

import java.util.ArrayList;
import java.util.List;

public class IdList implements AST_Node {

    List<String> idList = new ArrayList<>() ;

    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    @Override
    public String toString() {
        return "IdList{" +
                "idList=" + idList +
                '}';
    }
}
