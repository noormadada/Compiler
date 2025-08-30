package AST;

public class ThisPropertyExpr extends Expression implements AST_Node {

    String This;
    String id;

    public String getThis() {
        return This;
    }

    public void setThis(String aThis) {
        This = aThis;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ThisPropertyExpr{" +
                "\n This='" + This +
                "\n id='" + id +
                '}';
    }
}