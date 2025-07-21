package AST;

public class ThisExpr {
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
