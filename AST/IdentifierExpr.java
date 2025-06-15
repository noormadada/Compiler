package AST;

import java.util.ArrayList;
import java.util.List;

public class IdentifierExpr extends Expression implements AST_Node{
    List<String> Id=new ArrayList<>();
    List<Literal> literal=new ArrayList<>();

    public List<String> getId() {
        return Id;
    }

    public void setId(List<String> id) {
        Id = id;
    }

    public List<Literal> getLiteral() {
        return literal;
    }

    public void setLiteral(List<Literal> literal) {
        this.literal = literal;
    }

    @Override
    public String toString() {
        if(literal.isEmpty()){
            return "IdentifierExpr{" +
                    "Id=" + Id +
                    '}';
        }else {
            return "IdentifierExpr{" +
                    "Id=" + Id +
                    ", literal=" + literal +
                    '}';
        }
    }
}
