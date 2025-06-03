package AST;

import java.util.ArrayList;
import java.util.List;

public class StyleArray {
    List<CssLiteral> cssLiteral=new ArrayList<>();

    public List<CssLiteral> getCssLiteral() {
        return cssLiteral;
    }

    public void setCssLiteral(List<CssLiteral> cssLiteral) {
        this.cssLiteral = cssLiteral;
    }

    @Override
    public String toString() {
        return "\nStyleArray{" +
                "\ncssLiteral=" + cssLiteral +
                "\n}";
    }
}
