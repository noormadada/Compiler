package AST;

public class IdentifierExpr3 extends Expression implements AST_Node {
    String id;
    String number;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "IdentifierExpr3{" +
                "\n id='" + id +
                "\n  number='" + number +
                '}';
    }
}
