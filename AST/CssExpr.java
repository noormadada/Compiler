package AST;

public class CssExpr extends  Expression implements AST_Node{
    CssLiteral cssLiteral;

    public CssLiteral getCssLiteral() {
        return cssLiteral;
    }

    public void setCssLiteral(CssLiteral cssLiteral) {
        this.cssLiteral = cssLiteral;
    }

    @Override
    public String toString() {
        return "CssExpr{" +
                "cssLiteral=" + cssLiteral +
                '}';
    }
}
