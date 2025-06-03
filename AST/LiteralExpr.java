package AST;

public class LiteralExpr extends Expression {
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
