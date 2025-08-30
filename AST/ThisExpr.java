package AST;

public class ThisExpr extends Expression implements AST_Node {
    String This;

    public String getThis() {
        return This;
    }

    public void setThis(String aThis) {
        This = aThis;
    }

    @Override
    public String toString() {
        return "ThisExpr{" +
                "This='" + This + '\'' +
                '}';
    }
}