package AST;

public class CssLiteral implements AST_Node {
    CssContent cssContent;

    public CssContent getCssContent() {
        return cssContent;
    }

    public void setCssContent(CssContent cssContent) {
        this.cssContent = cssContent;
    }

    @Override
    public String toString() {
        return "CssLiteral{" +
                "cssContent=" + cssContent +
                '}';
    }
}
