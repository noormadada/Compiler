package AST;

import java.util.ArrayList;
import java.util.List;

public class Block implements AST_Node {
    List<Statement> statement=new ArrayList<>();

    public List<Statement> getStatement() {
        return statement;
    }

    public void setStatement(List<Statement> statement) {
        this.statement = statement;
    }
    @Override
    public String toString() {
        if(statement.isEmpty()) {
            return "";
        }
     else {
            return "Block{" +
                    "statement=" + statement +
                    '}';
        }
    }

}
