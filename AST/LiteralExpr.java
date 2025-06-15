package AST;

public class LiteralExpr extends Expression implements AST_Node {
Literal literal;

    public Literal getLiteral() {
        return literal;
    }

    public void setLiteral(Literal literal) {
        this.literal = literal;
    }

    @Override
    public String toString() {
        return "LiteralExpr{" +
                "literal=" + literal +
                '}';
    }
}
