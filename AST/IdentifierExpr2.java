package AST;

import java.util.ArrayList;
import java.util.List;

public class IdentifierExpr2 extends Expression implements AST_Node {

    List<String> id = new ArrayList<>();

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "IdentifierExpr2{" +
                "id=" + id +
                '}';
    }
}
